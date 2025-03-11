package com.mapping.demo.Inheritance.tablePerClass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;



@Entity(name="tc_Instructor")
public class Instructor extends User {
    private String specialization;
}
