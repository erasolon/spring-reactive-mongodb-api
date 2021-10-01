package com.erasolon.services;

import com.erasolon.documents.Post;
import com.erasolon.repositories.PostRepository;
import io.netty.util.concurrent.Promise;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

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
    public Mono<Post> save(Post post){
        return this.postRepository.save(post);
    }

    @Override
    public Flux<Post> findPostsByTime(Date dt) {
        return this.postRepository.findPostsByTime(dt);
    }
}
