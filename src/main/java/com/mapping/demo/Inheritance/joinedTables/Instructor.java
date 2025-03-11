package com.mapping.demo.Inheritance.joinedTables;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

//newly added branch we are pushing now- main branch
@PrimaryKeyJoinColumn(name="user_id")
@Entity(name="jt_Instructor")
public class Instructor extends User {
    private String specialization;
}

//mapped super class is explained in productservice it wont create entity for user that is parent class