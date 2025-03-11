package com.mapping.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String psp;
    @OneToMany
    private List<Laptop> laptopsinfo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsp() {
        return psp;
    }

    public void setPsp(String psp) {
        this.psp = psp;
    }

    public List<Laptop> getLaptopsinfo() {
        return laptopsinfo;
    }

    public void setLaptopsinfo(List<Laptop> laptopsinfo) {
        this.laptopsinfo = laptopsinfo;
    }

}
