package com.example.exceltodb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@ToString
@NoArgsConstructor
@Table(name = "document")
public class Document {

    @Id
    private String id;

    private String legalEntityId;

    private String unifiedLicenceNumber;

    private String tradeNameUnifiedTradeNameNumber;

    private String typeId;

    private String uploadDate;

    private String issueAuthorityId1;

    private String issueAuthorityReference;

    private String issueAuthorityTransaction;

    private String mimeTypeId;
}

