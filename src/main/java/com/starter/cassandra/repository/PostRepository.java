package com.starter.cassandra.repository;

import com.starter.cassandra.profile.Post;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface PostRepository extends CassandraRepository<Post,String> {
}
