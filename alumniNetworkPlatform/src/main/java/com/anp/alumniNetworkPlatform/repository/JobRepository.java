package com.anp.alumniNetworkPlatform.repository;

import com.anp.alumniNetworkPlatform.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
