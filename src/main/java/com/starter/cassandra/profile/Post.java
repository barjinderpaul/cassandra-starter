package com.starter.cassandra.profile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table("posts")
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @PrimaryKey
    @Column("post_id")
    private String postId;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String author;
}
