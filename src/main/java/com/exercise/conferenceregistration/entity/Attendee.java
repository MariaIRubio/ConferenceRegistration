package com.exercise.conferenceregistration.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class Attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name required")
    @Size(min = 1, message = "Field required")
    private String fullName;

    @NotNull(message = "Email required")
    @Size(min = 1, message = "Field required")
    private String email;

    @NotNull(message = "Phone required")
    @Size(min = 1, message = "Field required")
    private String phoneNumber;

    @NotNull(message = "Field required")
    private String dietaryPreferences;

    @NotNull(message = "Field required")
    private String sessionPreferences;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDietaryPreferences() {
        return dietaryPreferences;
    }

    public void setDietaryPreferences(String dietaryPreferences) {
        this.dietaryPreferences = dietaryPreferences;
    }

    public String getSessionPreferences() {
        return sessionPreferences;
    }

    public void setSessionPreferences(String sessionPreferences) {
        this.sessionPreferences = sessionPreferences;
    }

    @Override
    public String toString() {
        return " " + id  +
                "\n     | " + fullName +
                "\n     | " + dietaryPreferences +
                "\n     | " + sessionPreferences;
    }
}
