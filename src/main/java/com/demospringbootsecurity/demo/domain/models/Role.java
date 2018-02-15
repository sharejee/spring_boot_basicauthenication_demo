package com.demospringbootsecurity.demo.domain.models;

import javax.persistence.*;

/*
Create By: Ron Rith
Create Date: 2/15/2018
*/
@Entity
@Table(name = "role")
public class Role {
    private Long id;

    @Column(name="role")
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
