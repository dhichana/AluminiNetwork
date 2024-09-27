package com.anp.alumniNetworkPlatform.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "GroupMemberships")
public class GroupMembership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long membership_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MembershipStatus status;

    @Column(nullable = false)
    private LocalDateTime requested_at;

    @Column(nullable = true)
    private LocalDateTime approved_at;

    //Constructors
    public GroupMembership() {}

    public GroupMembership(Group group, User user, MembershipStatus status) {
        this.group = group;
        this.user = user;
        this.status = status;
        this.requested_at = LocalDateTime.now();
    }

    //getters and setters
    public Long getMembership_id() {
        return membership_id;
    }

    public void setMembership_id(Long membership_id) {
        this.membership_id = membership_id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MembershipStatus getStatus() {
        return status;
    }

    public void setStatus(MembershipStatus status) {
        this.status = status;
    }

    public LocalDateTime getRequested_at() {
        return requested_at;
    }

    public void setRequested_at(LocalDateTime requested_at) {
        this.requested_at = requested_at;
    }

    public LocalDateTime getApproved_at() {
        return approved_at;
    }

    public void setApproved_at(LocalDateTime approved_at) {
        this.approved_at = approved_at;
    }

}

