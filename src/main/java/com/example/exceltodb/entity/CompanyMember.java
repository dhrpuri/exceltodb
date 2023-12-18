package com.example.exceltodb.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@ToString
@Table(name = "company_member")
public class CompanyMember {
    @Id
    private String id;

    private String legalEntityId;

    private String companyId;

    private String statusId;

    private String addDate;

    private String cancelDate;

    private String memberRoleId;

}
