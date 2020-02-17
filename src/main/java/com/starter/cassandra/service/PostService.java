package com.starter.cassandra.service;

import com.starter.cassandra.profile.Post;
import java.util.List;

public interface PostService {
    String save(Post post);
    List<Post> getAllPosts();
    Post findPostByAuthor(String author);
    Post findPostByAuthorAndTitle(String author, String title);
    void removePost(String postId);
    Post updatePostById(String postId, Post post);

}
