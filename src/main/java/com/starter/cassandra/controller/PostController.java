package com.starter.cassandra.controller;

import com.starter.cassandra.profile.Post;
import com.starter.cassandra.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("/posts")
    public String addPost(@RequestBody Post post) {
        return postService.save(new Post(UUID.randomUUID().toString(),post.getTitle(),post.getContent(),post.getAuthor()));
    }

}
