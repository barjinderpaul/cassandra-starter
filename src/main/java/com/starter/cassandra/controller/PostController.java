package com.starter.cassandra.controller;

import com.starter.cassandra.profile.Post;
import com.starter.cassandra.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
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

    @GetMapping("/posts/{author}")
    public Post getPostByAuthor(@PathVariable("author") String author) {
        return postService.findPostByAuthor(author);
    }

    @GetMapping("/posts/{author}/{title}")
    public Post getPostsByAuthorAndTitle(@PathVariable("author") String author, @PathVariable("title") String title) {
        return postService.findPostByAuthorAndTitle(author,title);
    }

    @DeleteMapping("/posts/{postid}")
    public void deletePostById(@PathVariable("postid") String postId) {
        postService.removePost(postId);
    }

    @PutMapping("/posts/{postid}")
    public Post updatePostById(@PathVariable("postid") String postId, @RequestBody Post post) {
        return postService.updatePostById(postId,post);
    }

}
