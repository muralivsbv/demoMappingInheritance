package com.mapping.demo.Inheritance.tablePerClass;

import jakarta.persistence.*;


@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity(name ="tc_user")
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)  - wont work for TABLE_PER_CLASS
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String email;
    private String password;

}
