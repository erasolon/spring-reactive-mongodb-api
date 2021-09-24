package com.erasolon.services;

import com.erasolon.documents.Post;
import com.erasolon.repositories.PostRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PostServiceImpl implements PostService{

    Log log = LogFactory.getLog(PostServiceImpl.class);

    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Flux<Post> findAll() {
        return this.postRepository.findAll();
    }

    @Override
    public Mono<Post> save(Post post) {
        return this.postRepository.save(post);
    }
}
