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
@Table(name = "legal_entity")
public class LegalEntity {
    @Id
    private String id;

    private String personId;

    private String companyId;
}
