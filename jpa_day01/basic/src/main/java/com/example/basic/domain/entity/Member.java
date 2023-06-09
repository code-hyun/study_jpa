package com.example.basic.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String memberName;
    @Column(unique = true)
    private String memberEmail;
    private String memberPassword;
    private int memberAge;
}
