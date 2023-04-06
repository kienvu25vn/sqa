package com.example.sqa.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "customer_id")
    private String customer_id;

    @Column(name = "role")
    private String role;

    @Column(name = "create_at")
    private Date create_at;

}
