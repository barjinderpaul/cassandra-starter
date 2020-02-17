package com.starter.cassandra.serviceImplementation;

import com.starter.cassandra.profile.Post;
import com.starter.cassandra.repository.PostRepository;
import com.starter.cassandra.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
