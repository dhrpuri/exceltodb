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
    private Integer id;
    private Integer legalEntityId;
    private Integer unifiedLicenceNumber;
    private Integer unifiedTradeNameNumber;
    private Integer typeId;
    private LocalDateTime uploadDate;
    private Integer issueAuthorityId;
    private String issueAuthorityReference;
    private Integer issueAuthorityTransaction;
    private Integer mimeTypeId;
}

