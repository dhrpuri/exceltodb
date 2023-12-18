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
@Table(name = "issue_authority")
public class IssueAuthority {
    @Id
    private String id;

    private String issueAuthorityId1;
}
