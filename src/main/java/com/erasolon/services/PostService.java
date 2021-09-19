package com.erasolon.services;


import com.erasolon.documents.Post;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public interface PostService {
    Flux<Post> findAll();
    Mono<Post> save(Post post);
}
