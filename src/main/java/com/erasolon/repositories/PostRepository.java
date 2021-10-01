package com.erasolon.repositories;

import com.erasolon.documents.Post;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import reactor.core.publisher.Flux;

import java.util.Date;

@NoRepositoryBean
public interface PostRepository extends ReactiveMongoRepository<Post, String> {

    Flux<Post> findPostsByTime(Date dt);
}
