package com.mapping.demo.Inheritance.joinedTables;

import jakarta.persistence.*;


@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name ="jt_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

}
