package com.mapping.demo.Inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("2")

public class Mentor extends User {
   private String Company;
   private float avgRatingM;

}
