package com.starter.cassandra.repository;

import com.starter.cassandra.profile.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User,String> {
}
