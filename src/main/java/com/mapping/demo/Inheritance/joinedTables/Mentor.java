package com.mapping.demo.Inheritance.joinedTables;

import jakarta.persistence.*;


@Entity(name = "jt_Mentor")
//@PrimaryKeyJoinColumn(name="user_id")

public class Mentor extends User {
   private String Company;
   private float avgRatingM;

}


/*
@PrimaryKeyJoinColumn(name="user_id")?
If you want custom foreign key naming (user_id instead of id).
If your database has constraints that require a specific column name.
If your application queries rely on user_id instead of the default id.
Conclusion:
With @PrimaryKeyJoinColumn(name="user_id") → Foreign key column explicitly named user_id.
Without it → JPA defaults to id, and functionality remains the same unless other parts of the code depend on user_id.
 */
