package com.demospringbootsecurity.demo.domain.models.examgl;

import javax.persistence.*;

/*
Create By: Ron Rith
Create Date: 2/27/2018
*/
@Entity
@Table(name = "gl_area")
public class Area {
    private Long id;
    private String areaName;
    private String areaDec;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "area_name")
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Column(name = "area_dec")
    public String getAreaDec() {
        return areaDec;
    }

    public void setAreaDec(String areaDec) {
        this.areaDec = areaDec;
    }
}
