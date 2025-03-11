package com.mapping.demo.Inheritance.tablePerClass;

import jakarta.persistence.Entity;


@Entity(name = "tc_Mentor")

public class Mentor extends User {
   private String Company;
   private float avgRatingM;

}


