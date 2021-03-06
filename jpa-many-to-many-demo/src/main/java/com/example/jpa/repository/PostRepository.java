package com.example.jpa.repository;

import com.example.jpa.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Pariwesh gupta on 22/11/17.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
