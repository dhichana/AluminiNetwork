package com.anp.alumniNetworkPlatform.repository;

import com.anp.alumniNetworkPlatform.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
