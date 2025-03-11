package com.mapping.demo.Inheritance.joinedTables;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="jt_TA")
@PrimaryKeyJoinColumn(name="user_id")
public class TA extends User {
    private int noOfSessions;
    private float avgRating;
}

