package com.anp.alumniNetworkPlatform.repository;

import com.anp.alumniNetworkPlatform.entity.GroupMembership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupMembershipRepository extends JpaRepository<GroupMembership, Long> {
}
