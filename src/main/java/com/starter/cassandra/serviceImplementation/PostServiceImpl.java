package com.starter.cassandra.serviceImplementation;

import com.starter.cassandra.profile.Post;
import com.starter.cassandra.repository.PostRepository;
import com.starter.cassandra.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Override
    public String save(Post post) {
        return postRepository.save(post).getPostId();
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post findPostByAuthor(String author) {
        Optional<Post> postOptional = postRepository.findPostByAuthor(author);
        return postOptional.orElse(null);
    }

    @Override
    public Post findPostByAuthorAndTitle(String author, String title) {
        Optional<Post> postOptional = postRepository.findPostByAuthorAndTitle(author,title);
        return postOptional.orElse(null);
    }

    @Override
    public void removePost(String postId) {
        Post post = postRepository.findById(postId).get();
        postRepository.delete(post);
    }

    @Override
    public Post updatePostById(String postId, Post post) {
        Optional<Post> postOptional = postRepository.findById(postId);
        if (!postOptional.isPresent()) {
            return null;
        }

        Post postFromDB = postOptional.get();
        postFromDB.setTitle(post.getTitle());
        postFromDB.setContent(post.getContent());
        postFromDB.setAuthor(post.getAuthor());

        return postRepository.save(postFromDB);

    }
}
