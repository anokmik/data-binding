package com.anokmik.databinding.model;

public class User {

    public static User getDefault() {
        return new User("Sundar", "Pichai");
    }

    public final String firstName;

    public final String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}