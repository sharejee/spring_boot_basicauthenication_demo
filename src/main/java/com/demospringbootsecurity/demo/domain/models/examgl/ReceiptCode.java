package com.demospringbootsecurity.demo.domain.models.examgl;

import javax.persistence.*;

/*
Create By: Ron Rith
Create Date: 2/27/2018
*/
@Entity
@Table(name = "gl_receipt_code")
public class ReceiptCode {
    private Long id;

    private String code;

    private String des;

    private Area area;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "area_id")
    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
