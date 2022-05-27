package com.example.assignment4.model;

public class User {

    private long id;
    private String name;
    private String email;
    private String profilePhotoUrl;

    public User(long id, String name, String email, String profilePhotoUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }
}
