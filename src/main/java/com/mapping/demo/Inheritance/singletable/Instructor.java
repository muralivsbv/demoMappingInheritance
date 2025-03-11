package com.mapping.demo.Inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@DiscriminatorValue("1")
@Entity(name="st_Instructor")
public class Instructor extends User{
    private String specialization;
}
