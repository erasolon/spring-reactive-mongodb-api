package com.erasolon.repositories;

import com.erasolon.documents.Post;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PostRepository extends ReactiveMongoRepository<Post, String> {
}
