package com.example.exceltodb.processor;

import com.monitorjbl.xlsx.StreamingReader;
import org.apache.logging.log4j.util.Strings;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;

@Service
public class PersonSheetProcessor {
    private static final Logger logger = LoggerFactory.getLogger(PersonSheetProcessor.class);

    static HashMap<String, String> snakeCaseMap = new HashMap<>();

    static HashMap<String, String> sheetToTableName = new HashMap<>();
    @Autowired
    DataSource dataSource;
    
    public void readAndWriteToDB() throws SQLException {
        JdbcTemplate template = new JdbcTemplate(dataSource);
        Connection connection = template.getDataSource().getConnection();
        try (InputStream inputStream = new FileInputStream(new File("/Users/dhruv.puri/Downloads/exceltodb-feature-exceltodb-implementation/src/main/resources/MDM_ENTITIES.xlsx"))) { //FilePath from your device
            Workbook workbook = StreamingReader.builder().rowCacheSize(200).bufferSize(4096).open(inputStream);
            for (Sheet sheet : workbook) {
                if(sheet.getSheetName().equalsIgnoreCase("Activity Issue Authority") || sheet.getSheetName().equalsIgnoreCase("Activity"))
                {
                    continue;
                }
                String columns="";
                Row headerRow = null;
                for (Row row : sheet) {
                    if(row.getRowNum() ==0) {
                         headerRow = row;
                         columns=getColumns(headerRow);
                         continue;
                    }
                        try{
                                if (row.getCell(0) == null || (Strings.isBlank(row.getCell(0).getStringCellValue()))) {
                                    break;
                                }
                                PreparedStatement preparedStatement = prepareStatement(connection, columns, row, sheet.getSheetName());
                                preparedStatement.executeUpdate();
                                preparedStatement.close();
                            }
                         catch (SQLException e) {
                            e.printStackTrace();

                        }
                }
                System.out.println("#########Sheet completed susccessfully ::: with table "+sheet.getSheetName() + ":::"+sheetToTableName.get(sheet.getSheetName()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        private static PreparedStatement prepareStatement(Connection connection, String coulumns, Row currentRow, String sheetName)
            throws SQLException {
        String tableName = sheetToTableName.get(sheetName);
        StringBuilder sqlStament= new StringBuilder("INSERT INTO ").append(tableName);
        String sql = " (" +
                coulumns +
                ") VALUES (" +
                getValues(currentRow) +
                ")";
        sqlStament.append(sql);
        PreparedStatement preparedStatement = connection.prepareStatement(sqlStament.toString());
        for (int i = 0; i < currentRow.getLastCellNum(); i++) {
            preparedStatement.setString(i + 1, currentRow.getCell(i).getStringCellValue());
        }
        return preparedStatement;
    }

    private static String getColumns(Row headerRow) {
        StringBuilder columns = new StringBuilder();
        for (int i = 0; i < headerRow.getLastCellNum(); i++) {
            String columnName = snakeCaseMap.get(headerRow.getCell(i).getStringCellValue().trim());
            columns.append(columnName);
            if (i < headerRow.getLastCellNum() - 1) {
                columns.append(", ");
            }
        }
        System.out.println("Column names build ::::"+columns.toString());
        return columns.toString();
    }

    private static String getValues(Row currentRow) {
        StringBuilder values = new StringBuilder();
        for (int i = 0; i < currentRow.getLastCellNum(); i++) {
            values.append("?");
            if (i < currentRow.getLastCellNum() - 1) {
                values.append(", ");
            }
        }
        return values.toString();
    }

    public static String camelCaseToLowerCaseWithUnderscore(String input) {
        // Remove special characters and replace with space
        String cleanedString = input.replaceAll("[^a-zA-Z0-9]", " ");

        // Split by space and join with underscores
        String[] words = cleanedString.split("\\s+");
        StringBuilder snakeCaseBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            snakeCaseBuilder.append(words[i].toLowerCase());
            if (i < words.length - 1) {
                snakeCaseBuilder.append("_");
            }
        }

        return snakeCaseBuilder.toString();
    }

    static {
        snakeCaseMap.put("ID", "id");
        snakeCaseMap.put("Issue Authority - ID", "issue_authority_id1");
        snakeCaseMap.put("Issue Authority ID", "issue_authority_id");
        snakeCaseMap.put("Birth Date", "birth_date");
        snakeCaseMap.put("Gender - ID", "gender_id");
        snakeCaseMap.put("Unified ID", "unified_id");
        snakeCaseMap.put("Emirates ID", "emirates_id");
        snakeCaseMap.put("Emirates ID Issue Date", "emirates_id_issue_date");
        snakeCaseMap.put("Emirates ID Expiry Date", "emirates_id_expiry_date");
        snakeCaseMap.put("Passport Number", "passport_number");
        snakeCaseMap.put("Passport Issue Date", "passport_issue_date");
        snakeCaseMap.put("Passport Expiry Date", "passport_expiry_date");
        snakeCaseMap.put("Passport Issue Place English", "passport_issue_place_english");
        snakeCaseMap.put("Passport Issue Place Arabic", "passport_issue_place_arabic");
        snakeCaseMap.put("Passport Issue Country - ID", "passport_issue_country_id");
        snakeCaseMap.put("Birth Place English", "birth_place_english");
        snakeCaseMap.put("Birth Place Arabic", "birth_place_arabic");
        snakeCaseMap.put("Birth Country - ID", "birth_country_id");
        snakeCaseMap.put("Decree Number", "decree_number");
        snakeCaseMap.put("Arabic Name", "arabic_name");
        snakeCaseMap.put("English Name", "english_name");
        snakeCaseMap.put("Email", "email");
        snakeCaseMap.put("Mobile", "mobile");
        snakeCaseMap.put("Status - ID", "status_id");
        snakeCaseMap.put("Status Reason - ID", "status_reason_id");
        snakeCaseMap.put("Active Person - ID", "active_person_id");
        snakeCaseMap.put("Nationality - ID", "nationality_id");
        snakeCaseMap.put("Address - ID", "address_id");
        snakeCaseMap.put("Language Preference - ID", "language_preference_id");
        snakeCaseMap.put("File Number", "file_number");
        snakeCaseMap.put("GCC UID", "gcc_uid");
        snakeCaseMap.put("Family Book Number", "family_book_number");
        snakeCaseMap.put("Is Verified Contact", "is_verified_contact");
        snakeCaseMap.put("Last Updated By - ID", "last_updated_by_id");
        snakeCaseMap.put("Is Mobile Verified", "is_mobile_verified");
        snakeCaseMap.put("Mobile Verification Date", "mobile_verification_date");
        snakeCaseMap.put("Mobile Verification Channel - ID", "mobile_verification_channel_id");
        snakeCaseMap.put("Is Email Verified", "is_email_verified");
        snakeCaseMap.put("Email Verification Date", "email_verification_date");
        snakeCaseMap.put("Email Verification Channel - ID", "email_verification_channel_id");
        snakeCaseMap.put("Is Screened", "is_screened");
        snakeCaseMap.put("Screening Date", "screening_date");
        snakeCaseMap.put("Screening Channel - ID", "screening_channel_id");
        snakeCaseMap.put("Person - ID", "person_id");
        snakeCaseMap.put("Company - ID", "company_id");
        snakeCaseMap.put("Activity Code - Code", "activity_code");
        snakeCaseMap.put("English Name", "english_name");
        snakeCaseMap.put("Arabic Name", "arabic_name");
        snakeCaseMap.put("English Description", "english_description");
        snakeCaseMap.put("Arabic Description", "arabic_description");
        snakeCaseMap.put("Activity Type - ID", "activity_type_id");
        snakeCaseMap.put("Status - ID", "status_id");
        snakeCaseMap.put("Section", "section");
        snakeCaseMap.put("Division", "division");
        snakeCaseMap.put("Group", "group_id");
        snakeCaseMap.put("Class", "class_field");
        snakeCaseMap.put("Legal Entity - ID", "legal_entity_id");
        snakeCaseMap.put("Associated Legal Entity - ID", "associated_legal_entity_id");
        snakeCaseMap.put("Association Type - ID", "association_type_id");
        snakeCaseMap.put("Start Date", "start_date");
        snakeCaseMap.put("Cancellation Date", "cancellation_date");
        snakeCaseMap.put("Expiry Date", "expiry_date");
        snakeCaseMap.put("Legal Entity - ID", "legal_entity_id");
        snakeCaseMap.put("Company - ID", "company_id");
        snakeCaseMap.put("Profit Loss Share", "profit_loss_share");
        snakeCaseMap.put("Status - ID", "status_id");
        snakeCaseMap.put("OwnershipShare", "ownership_share");
        snakeCaseMap.put("Add Date", "add_date");
        snakeCaseMap.put("Cancel Date", "cancel_date");
        snakeCaseMap.put("InvestorRole - ID", "investor_role_id");
        snakeCaseMap.put("Display Sequence", "display_sequence");
        snakeCaseMap.put("Legal Entity - ID", "legal_entity_id");
        snakeCaseMap.put("Licence - Unified Licence Number", "unified_licence_number");
        snakeCaseMap.put("Status - ID", "status_id");
        snakeCaseMap.put("Add Date", "add_date");
        snakeCaseMap.put("Cancel Date", "cancel_date");
        snakeCaseMap.put("Member Role - ID", "member_role_id");
        snakeCaseMap.put("Legal Entity - ID", "legal_entity_id");
        snakeCaseMap.put("Company - ID", "company_id");
        snakeCaseMap.put("Status - ID", "status_id");
        snakeCaseMap.put("Add Date", "add_date");
        snakeCaseMap.put("Cancel Date", "cancel_date");
        snakeCaseMap.put("Member Role - ID", "member_role_id");
        snakeCaseMap.put("Legal Entity - ID", "legal_entity_id");
        snakeCaseMap.put("Company - ID", "company_id");
        snakeCaseMap.put("Status - ID", "status_id");
        snakeCaseMap.put("Add Date", "add_date");
        snakeCaseMap.put("Cancel Date", "cancel_date");
        snakeCaseMap.put("Member Role - ID", "member_role_id");
        snakeCaseMap.put("Issue Authority ID", "issue_authority_id");
        snakeCaseMap.put("Arabic Name", "arabic_name");
        snakeCaseMap.put("English Name", "english_name");
        snakeCaseMap.put("Email", "email");
        snakeCaseMap.put("Mobile", "mobile");
        snakeCaseMap.put("Nationality - ID", "nationality_id");
        snakeCaseMap.put("Status - ID", "status_id");
        snakeCaseMap.put("Address - ID", "address_id");
        snakeCaseMap.put("Legal Type - ID", "legal_type_id");
        snakeCaseMap.put("Issue Date", "issue_date");
        snakeCaseMap.put("Expiry Date", "expiry_date");
        snakeCaseMap.put("Cancellation Date", "cancellation_date");
        snakeCaseMap.put("Origin Licence Number", "origin_licence_number");
        snakeCaseMap.put("Is Mobile Verified", "is_mobile_verified");
        snakeCaseMap.put("Mobile Verification Date", "mobile_verification_date");
        snakeCaseMap.put("Mobile Verification Channel - ID", "mobile_verification_channel_id");
        snakeCaseMap.put("Is Email Verified", "is_email_verified");
        snakeCaseMap.put("Email Verification Date", "email_verification_date");
        snakeCaseMap.put("Email Verification Channel - ID", "email_verification_channel_id");
        snakeCaseMap.put("Is Screened", "is_screened");
        snakeCaseMap.put("Screening Date", "screening_date");
        snakeCaseMap.put("Screening Channel - ID", "screening_channel_id");
        snakeCaseMap.put("Total Ownership Share", "total_ownership_share");
        snakeCaseMap.put("Has Discrepancy", "has_discrepancy");
        snakeCaseMap.put("Has UBO Exemption", "has_ubo_exemption");
        snakeCaseMap.put("Commerce Registry Number", "commerce_registry_number");
        snakeCaseMap.put("Issue Authority Commerce Registry Number", "issue_authority_commerce_registry_number");
        snakeCaseMap.put("Company - ID", "company_id");
        snakeCaseMap.put("Company Duration", "company_duration");
        snakeCaseMap.put("Share Type - ID", "share_type_id");
        snakeCaseMap.put("Share Value", "share_value");
        snakeCaseMap.put("Number of Shares", "number_of_shares");
        snakeCaseMap.put("Capital Nominated Amount", "capital_nominated_amount");
        snakeCaseMap.put("Capital Paid Amount", "capital_paid_amount");
        snakeCaseMap.put("Capital Invested in Dubai", "capital_invested_in_dubai");
        snakeCaseMap.put("Attestation Authority - ID", "attestation_authority_id");
        snakeCaseMap.put("Currency - ID", "currency_id");
        snakeCaseMap.put("National Registry Number", "national_registry_number");
        snakeCaseMap.put("Code", "activity_code");
        snakeCaseMap.put("Activity - Code", "activity_code");
        snakeCaseMap.put("Activity Group - Activity Group Code", "activity_group_code");
        snakeCaseMap.put("Trade Name - Unified Trade Name Number", "unified_trade_name_number");

        snakeCaseMap.put("Activity Issue Authority - Activity Code - Code", "activity_issue_authority_activity_code");
        snakeCaseMap.put("Activity Issue Authority - Issue Authority - ID", "activity_issue_authority_issue_authority_code");
        snakeCaseMap.put("Activity Specification - Activity Specification Code", "activity_specification_code");
        snakeCaseMap.put("Activity Specification Code", "activity_specification_code");
        snakeCaseMap.put("Activity Group Code", "activity_group_code");

        snakeCaseMap.put("Type - ID", "type_id");
        snakeCaseMap.put("Account", "account");

        snakeCaseMap.put("Licence - Unified Licence Number", "unified_licence_number");
        snakeCaseMap.put("Ejari Licence - Unified Licence Number", "ejari_unified_licence_number");
        snakeCaseMap.put("Makani Number", "makani_number");
        snakeCaseMap.put("Ejari Number", "ejari_number");
        snakeCaseMap.put("DEWA Account Number", "dewa_account_number");
        snakeCaseMap.put("Ejari Start Date", "ejari_start_date");
        snakeCaseMap.put("Ejari End Date", "ejari_end_date");
        snakeCaseMap.put("Owner Name", "owner_name");
        snakeCaseMap.put("Tenant Name", "tenant_name");
        snakeCaseMap.put("Contract Amount", "contract_amount");
        snakeCaseMap.put("Area", "area");
        snakeCaseMap.put("Is Primary Location", "is_primary_location");
        snakeCaseMap.put("Area Zone", "area_zone");
        snakeCaseMap.put("Zone English", "zone_english");
        snakeCaseMap.put("Zone Arabic", "zone_arabic");
        snakeCaseMap.put("Location Code", "location_code");
        snakeCaseMap.put("Location English", "location_english");
        snakeCaseMap.put("Location Arabic", "location_arabic");


        //////address////////////
        snakeCaseMap.put("ID", "id");
        snakeCaseMap.put("Area - Area Code", "area_code");
        snakeCaseMap.put("Address Type - ID", "address_type_id");
        snakeCaseMap.put("PO Box", "po_box");
        snakeCaseMap.put("Address line 1", "address_line1");
        snakeCaseMap.put("Address line 2", "address_line2");
        snakeCaseMap.put("Floor", "floor");
        snakeCaseMap.put("Street", "street");
        snakeCaseMap.put("Unit Type - ID", "unit_type_id");
        snakeCaseMap.put("Unit Number", "unit_number");
        snakeCaseMap.put("Parcel ID", "parcel_id");
        snakeCaseMap.put("Country - ID", "country_id");
        snakeCaseMap.put("Emirate - ID", "emirate_id");
        snakeCaseMap.put("State", "state");
        snakeCaseMap.put("Freezone - ID", "freezone_id");
        snakeCaseMap.put("Longitude", "longitude");
        snakeCaseMap.put("Latitude", "latitude");
        snakeCaseMap.put("Related Entity Code", "related_entity_code");

        snakeCaseMap.put("UBO - ID", "ubo_id");
        snakeCaseMap.put("Source Type - ID", "source_type_id");
        snakeCaseMap.put("Details", "details");




        /////license//////////
        snakeCaseMap.put("Unified Licence Number", "unified_licence_number");
        snakeCaseMap.put("DBN", "dbn");
        snakeCaseMap.put("Issue Authority - ID", "issue_authority_id1");
        snakeCaseMap.put("Issue Authority Licence Number", "issue_authority_licence_number");
        snakeCaseMap.put("Issue Date", "issue_date");
        snakeCaseMap.put("Expiry Date", "expiry_date");
        snakeCaseMap.put("Cancellation Date", "cancellation_date");
        snakeCaseMap.put("Freeze Start Date", "freeze_start_date");
        snakeCaseMap.put("Freeze End Date", "freeze_end_date");
        snakeCaseMap.put("Category - ID", "category_id");
        snakeCaseMap.put("Activity Type - ID", "activity_type_id");
        snakeCaseMap.put("Status - ID", "status_id");
        snakeCaseMap.put("Trade Name - Unified Trade Name Number", "trade_name_unified_trade_name_number");
        snakeCaseMap.put("Company - ID", "company_id");
        snakeCaseMap.put("Is Main Licence", "is_main_licence");
        snakeCaseMap.put("Dubai CoC Number", "dubai_cocnumber");
        snakeCaseMap.put("Liquidation Date", "liquidation_date");
        snakeCaseMap.put("ICP Establishment Card", "icp_establishment_card");
        snakeCaseMap.put("MOHRE Establishment Card", "mohre_establishment_card");
        snakeCaseMap.put("DUNS Number", "duns_number");
        snakeCaseMap.put("TIN", "tin");
        snakeCaseMap.put("Initial Approval", "initial_approval");
        snakeCaseMap.put("Initial Approval Issue Date", "initial_approval_issue_date");
        snakeCaseMap.put("Initial Approval Expiry Date", "initial_approval_expiry_date");
        snakeCaseMap.put("Email", "email");
        snakeCaseMap.put("Mobile", "mobile");
        snakeCaseMap.put("Phone", "phone");
        snakeCaseMap.put("Address - ID", "address_id");
        snakeCaseMap.put("Logo", "logo");
        snakeCaseMap.put("Is Freehold", "is_freehold");
        snakeCaseMap.put("Last Updated By - ID", "last_updated_by_id");
        snakeCaseMap.put("Is Mobile Verified", "is_mobile_verified");
        snakeCaseMap.put("Mobile Verification Date", "mobile_verification_date");
        snakeCaseMap.put("Mobile Verification Channel - ID", "mobile_verification_channel_id");
        snakeCaseMap.put("Is Email Verified", "is_email_verified");
        snakeCaseMap.put("Email Verification Date", "email_verification_date");
        snakeCaseMap.put("Email Verification Channel - ID", "email_verification_channel_id");
        snakeCaseMap.put("Is Screened", "is_screened");
        snakeCaseMap.put("Screening Date", "screening_date");
        snakeCaseMap.put("Screening Channel - ID", "screening_channel_id");
        snakeCaseMap.put("Is Exempt DUL Criteria Check", "is_exempt_dul_criteria_check");
        snakeCaseMap.put("Version", "version");
        snakeCaseMap.put("Main Area - Main Area Code", "main_area_code");//Area Code
        snakeCaseMap.put("Area Code", "area_code");
        snakeCaseMap.put("Main Area Code", "main_area_code");
        snakeCaseMap.put("Unified Trade Name Number", "unified_trade_name_number");
        snakeCaseMap.put("Issue Authority Trade Name Number", "issue_authority_trade_name_number");

        snakeCaseMap.put("Is PEP", "is_pep");
        snakeCaseMap.put("PEP Profile - ID", "pep_profile_id");
        snakeCaseMap.put("PEP Details", "pep_details");
        snakeCaseMap.put("UBO Declaration - ID", "ubo_declaration_id");

        //////legal_contract//////////
        snakeCaseMap.put("ID", "id");
        snakeCaseMap.put("Licence - Unified Licence Number", "unified_licence_number");
        snakeCaseMap.put("Company - ID", "company_id");
        snakeCaseMap.put("IssueAuthority - ID", "issue_authority_id");
        snakeCaseMap.put("Issue Authority Contract Number", "issue_authority_contract_number");
        snakeCaseMap.put("Company Duration", "company_duration");
        snakeCaseMap.put("Number of Shares", "number_of_shares");
        snakeCaseMap.put("Share Value", "share_value");
        snakeCaseMap.put("Capital", "capital");
        snakeCaseMap.put("Director Tenure", "director_tenure");
        snakeCaseMap.put("Issue Date", "issue_date");
        snakeCaseMap.put("Contract Type - ID", "contract_type_id");

        snakeCaseMap.put("UBO - ID", "ubo_id");
        snakeCaseMap.put("Country - ID", "country_id");
        snakeCaseMap.put("Details", "details");

        snakeCaseMap.put("LegalContract - ID", "legal_contract_id");
        snakeCaseMap.put("Person - ID", "person_id");
        snakeCaseMap.put("Authority - ID", "authority_id");


        snakeCaseMap.put("Issue Authority Reference", "issue_authority_reference");
        snakeCaseMap.put("Issue Authority Transaction", "issue_authority_transaction");
        snakeCaseMap.put("MIME Type - ID", "mime_type_id");

        snakeCaseMap.put("Upload Date", "upload_date");


        //ubo-declaration////
        snakeCaseMap.put("ID", "id");
        snakeCaseMap.put("Company - ID", "company_id");
        snakeCaseMap.put("Mobile", "mobile");
        snakeCaseMap.put("Channel - ID", "channel_id");
        snakeCaseMap.put("Notification Date", "notification_date");
        snakeCaseMap.put("Declaration Date", "declaration_date");
        snakeCaseMap.put("Is Exempt Income Source Check", "is_exempt_income_source_check");
        snakeCaseMap.put("Is Exempt PEP Declaration", "is_exempt_pep_declaration");


        /////////////###############//////////////////////////////////////////
        sheetToTableName.put("Person", "person");
        sheetToTableName.put("Legal Entity", "legal_entity");
        sheetToTableName.put("Activity Issue Authority", "activity_issue_authority");
        sheetToTableName.put("Legal Entity Association", "legal_entity_association");
        sheetToTableName.put("Ownership", "ownership");
        sheetToTableName.put("Licence Members", "license_member");

        sheetToTableName.put("Company Members", "company_member");
        sheetToTableName.put("Company", "company");
        sheetToTableName.put("Commerce Registry", "comerce_registry");
        sheetToTableName.put("Company Activity", "company_activity");
        sheetToTableName.put("Operating Activity", "operating_activity");
        sheetToTableName.put("Activity", "activity");

        sheetToTableName.put("Activity Specification", "activity_specification");
        sheetToTableName.put("Activity Group", "activity_group");
        sheetToTableName.put("Activity Group Relationship", "activity_group_linking");
        sheetToTableName.put("Licence", "license");
        sheetToTableName.put("Digital Platform", "digital_platform");
        sheetToTableName.put("Business Location", "businesslocation");

        sheetToTableName.put("Address", "address");
        sheetToTableName.put("Main Area", "main_area");
        sheetToTableName.put("Area", "area");
        sheetToTableName.put("Trade Name", "trade_name");
        sheetToTableName.put("UBO", "ubo");
        sheetToTableName.put("Income Source", "income_source");

        sheetToTableName.put("Income Country", "income_country");///////
        sheetToTableName.put("UBO Declaration", "ubo_declaration");
        sheetToTableName.put("Document", "document");
        sheetToTableName.put("Legal Contract", "legal_contract");
        sheetToTableName.put("Person Authority", "person_authority");
        sheetToTableName.put("Issue Authority Channel", "issue_authority");


    }
}
