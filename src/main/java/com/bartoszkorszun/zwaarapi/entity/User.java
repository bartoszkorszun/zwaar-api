package com.bartoszkorszun.zwaarapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public final class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "height")
    private int height;
    @Column(name = "weight")
    private double weight;
    @Column(name = "bmi")
    private double bmi;
    @Column(name = "notifications")
    private boolean notifications;

    public static class Builder {
        private final String name;
        private final String email;
        private final String password;
        private int height;
        private double weight;
        private boolean notifications;

        public Builder(String name, String email, String password) {
            this.name = name;
            this.email = email;
            this.password = password;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder notifications(boolean notifications) {
            this.notifications = notifications;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
        this.height = builder.height;
        this.weight = builder.weight;
        this.notifications = builder.notifications;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getBmi() {
        return weight / ((height * height) / 10000.0);
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }

    public boolean isNotifications() {
        return notifications;
    }

    // Required by JPA
    @Deprecated
    protected User() {
    }
}
