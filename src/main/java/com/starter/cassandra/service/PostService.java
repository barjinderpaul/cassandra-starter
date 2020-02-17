package com.starter.cassandra.service;

import com.starter.cassandra.profile.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    String save(Post post);
    List<Post> getAllPosts();
}
