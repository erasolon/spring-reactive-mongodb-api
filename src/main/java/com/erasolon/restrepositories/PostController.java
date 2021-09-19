package com.erasolon.restrepositories;

import com.erasolon.documents.Post;
import com.erasolon.services.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/posts")
public class PostController {

    private final PostService postService;

    PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(produces = "application/json")
    public Flux<Post> all() {
        return this.postService.findAll();
    }

    @PostMapping(produces = "application/json")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<Post> save(@RequestBody Post post) {
        return this.postService.save(post);
    }

}
