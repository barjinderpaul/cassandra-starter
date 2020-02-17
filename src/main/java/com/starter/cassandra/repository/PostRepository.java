package com.starter.cassandra.repository;

import com.starter.cassandra.profile.Post;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import java.util.Optional;

public interface PostRepository extends CassandraRepository<Post,String> {
    @Query(allowFiltering = true)
    Optional<Post> findPostByAuthor(String author);

    @Query(allowFiltering = true)
    Optional<Post> findPostByAuthorAndTitle(String author, String title);

}
