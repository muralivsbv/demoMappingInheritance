package com.mapping.demo.Inheritance.tablePerClass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="tc_TA")

public class TA extends User {
    private int noOfSessions;
    private float avgRating;
}

