package com.anp.alumniNetworkPlatform.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Column(nullable = true)
    private String bio;

    @Column(nullable = true)
    private String education;

    @Column(nullable = true)
    private String work_history;

    @Column(nullable = true)
    private String profile_picture;

    @Column(nullable = false)
    private LocalDateTime created_at;

    @Column(nullable = false)
    private LocalDateTime updated_at;

    //constructors
    public User() {}

    public User(String email, String password, String first_name, String last_name, UserRole role) {
        this.email = email;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    //getters
    public String getEmail() {
        return email;
    }

    public Long getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public UserRole getRole() {
        return role;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getBio() {
        return bio;
    }

    public String getEducation() {
        return education;
    }

    public String getWork_history() {
        return work_history;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }


    //setters
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setWork_history(String work_history) {
        this.work_history = work_history;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

}
