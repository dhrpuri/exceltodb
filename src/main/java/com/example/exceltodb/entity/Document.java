package com.example.exceltodb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "document")
@Data
@ToString
@NoArgsConstructor
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "person_issue_authority_id")
    private String personIssueAuthorityID;

    @Column(name = "company_issue_authority_id")
    private String companyIssueAuthorityID;

    @Column(name = "type")
    private int type;

    @Column(name = "upload_date")
    private LocalDateTime uploadDate;

    @Column(name = "issue_authority_reference")
    private String issueAuthorityReference;

    @Column(name = "issue_authority_transaction")
    private String issueAuthorityTransaction;

    @Column(name = "issue_authority_licence_number")
    private Integer issueAuthorityLicenceNumber;

    @Column(name = "issue_authority_trade_name_number")
    private Integer issueAuthorityTradeNameNumber;
}

