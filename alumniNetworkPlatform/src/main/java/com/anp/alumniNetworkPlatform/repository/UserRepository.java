package com.anp.alumniNetworkPlatform.repository;

import com.anp.alumniNetworkPlatform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
