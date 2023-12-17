package com.example.devops.domain;

import jakarta.persistence.*;

import java.io.Serializable;


/**
 *
 * @author Remi Venant <remi.venant@gmail.com>
 */
@Entity
@Table(name = "personnes")
public class Person implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(nullable = false)
    private String lastname;
    
    @Column(nullable = false)
    private String firstname;
    
    private int age;
    
    private String email;

    public Person() {
    }

    public Person(String lastname, String firstname, int age, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }


}
