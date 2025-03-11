package com.mapping.demo.Inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name="st_TA")
@DiscriminatorValue("3")
public class TA extends User{
    private int noOfSessions;
    private float avgRating;
}
