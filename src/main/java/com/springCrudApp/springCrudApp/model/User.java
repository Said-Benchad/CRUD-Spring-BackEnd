package com.springCrudApp.springCrudApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name="nom")
    String Nom;
    @Column(name="username")

    String username;
    @Column(name="password")

    String password;
    @Column(name="email")

    String email;
    @Column(name="age")

    int age;

    public User(int id, String nom, String username, String password, String email, int age) {
        this.id = id;
        Nom = nom;
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
    }
    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
