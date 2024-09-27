package com.anp.alumniNetworkPlatform.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Followers")
public class Follower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long follower_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "follower_user_id", nullable = false)
    private User follower;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "following_user_id", nullable = false)
    private User following;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private FollowRequestStatus status;

    @Column(nullable = false)
    private LocalDateTime requested_at;

    @Column(nullable = true)
    private LocalDateTime accepted_at;

    @Column(nullable = true)
    private LocalDateTime rejected_at;

    //Constructors
    public Follower() {}

    public Follower(User follower, User following, FollowRequestStatus status) {
        this.follower = follower;
        this.following = following;
        this.status = status;
        this.requested_at = LocalDateTime.now();
    }

    //getters and setters
    public Long getFollower_id() {
        return follower_id;
    }

    public void setFollower_id(Long follower_id) {
        this.follower_id = follower_id;
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }

    public User getFollowing() {
        return following;
    }

    public void setFollowing(User following) {
        this.following = following;
    }

    public FollowRequestStatus getStatus() {
        return status;
    }

    public void setStatus(FollowRequestStatus status) {
        this.status = status;
    }

    public LocalDateTime getRequested_at() {
        return requested_at;
    }

    public void setRequested_at(LocalDateTime requested_at) {
        this.requested_at = requested_at;
    }

    public LocalDateTime getAccepted_at() {
        return accepted_at;
    }

    public void setAccepted_at(LocalDateTime accepted_at) {
        this.accepted_at = accepted_at;
    }

    public LocalDateTime getRejected_at() {
        return rejected_at;
    }

    public void setRejected_at(LocalDateTime rejected_at) {
        this.rejected_at = rejected_at;
    }
}
