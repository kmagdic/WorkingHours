package com.workinghours.WorkingHours.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    long id;

    String firstName;

    String lastName;

    String email;

    String password;

    Date dateOfBirth;

    // if 1 then archived
    int archived;

    // 1 - korisnik
    // 2 -
    int type;



}
