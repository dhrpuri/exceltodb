package com.example.exceltodb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@ToString
@NoArgsConstructor
@Table(name = "ubo_declaration")
public class UboDeclaration {

    @Id
    private String id;

    private String companyId;

    private String mobile;

    private String channelId;

    private String notificationDate;

    private String declarationDate;

    private String isExemptIncomeSourceCheck;

    private String isExemptPepDeclaration;
}

