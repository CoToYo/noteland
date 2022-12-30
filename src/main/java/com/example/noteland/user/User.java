package com.example.noteland.user;

import java.time.LocalDate;

public class User {
    private Long id;
    private String username;
    private String email;
    private LocalDate signupDate;
    private String phoneNumber;

    public User(Long id, String username, String email, LocalDate signupDate, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.signupDate = signupDate;
        this.phoneNumber = phoneNumber;
    }

    public User(String username, String email, LocalDate signupDate, String phoneNumber) {
        this.username = username;
        this.email = email;
        this.signupDate = signupDate;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getSignupDate() {
        return signupDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSignupDate(LocalDate signupDate) {
        this.signupDate = signupDate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", signupDate=" + signupDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
