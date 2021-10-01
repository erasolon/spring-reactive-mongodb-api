package com.erasolon.restrepositories;

import com.erasolon.documents.Post;
import com.erasolon.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin("http://localhost:3000")
public class PostController {

    private final PostService postService;

    @Autowired
    PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = "/posts", produces = "application/json")
    public Flux<Post> all() {
        return this.postService.findAll();
    }

    @PostMapping(value = "/posts",produces = "application/json")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<Post> save(@RequestBody Post post) {
        return this.postService.save(post);
    }
    
    @GetMapping(value = "/postdate",  produces = "application/json")
    @ResponseBody
    public Flux<Post> latest(@RequestParam(name = "date") String dateStr) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").parse(dateStr);
            return this.postService.findPostsByTime(date);
        }catch(ParseException e) {
            return null;
        }

    }

}
