package com.anp.alumniNetworkPlatform.repository;

import com.anp.alumniNetworkPlatform.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
