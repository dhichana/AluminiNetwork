package com.anp.alumniNetworkPlatform.repository;

import com.anp.alumniNetworkPlatform.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
