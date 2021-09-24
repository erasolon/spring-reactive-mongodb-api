package com.erasolon.repositories;

import com.erasolon.documents.Post;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.reactivestreams.Publisher;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
@RequiredArgsConstructor
public class PostRepositoryImpl implements PostRepository {

    Log log = LogFactory.getLog(PostRepositoryImpl.class);

    private final ReactiveMongoTemplate template;

    @Override
    public <S extends Post> Mono<S> insert(S s) {
        return null;
    }

    @Override
    public <S extends Post> Flux<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends Post> Flux<S> insert(Publisher<S> publisher) {
        return null;
    }

    @Override
    public <S extends Post> Mono<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Post> Flux<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Post> Flux<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Post> Mono<Long> count(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Post> Mono<Boolean> exists(Example<S> example) {
        return null;
    }

    @Override
    public Flux<Post> findAll(Sort sort) {
        return null;
    }

    @Override
    public <S extends Post> Mono<S> save(S s) {
        return template.save(s);
    }

    @Override
    public <S extends Post> Flux<S> saveAll(Iterable<S> iterable) {
        return Flux.fromIterable(iterable).flatMap(template::save);
    }

    @Override
    public <S extends Post> Flux<S> saveAll(Publisher<S> publisher) {
        return null;
    }

    @Override
    public Mono<Post> findById(String id) {
        return template.findById(id, Post.class);
    }

    @Override
    public Mono<Post> findById(Publisher<String> publisher) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(String s) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(Publisher<String> publisher) {
        return null;
    }

    @Override
    public Flux<Post> findAll() {
        return template.findAll(Post.class);
    }

    @Override
    public Flux<Post> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public Flux<Post> findAllById(Publisher<String> publisher) {
        return null;
    }

    @Override
    public Mono<Long> count() {
        return null;
    }

    @Override
    public Mono<Void> deleteById(String id) {
        //return template.remove(query(where("id").is(id)), Post.class).map(DeleteResult::getDeletedCount);
        return template.remove(query(where("id").is(id)), Post.class).then();
    }



    @Override
    public Mono<Void> deleteById(Publisher<String> publisher) {
        return null;
    }

    @Override
    public Mono<Void> delete(Post post) {
        return null;
    }

    @Override
    public Mono<Void> deleteAllById(Iterable<? extends String> iterable) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Iterable<? extends Post> iterable) {
        //return template.remove(Post.class).all().map(DeleteResult::getDeletedCount);
        return template.remove(Post.class).all().then();
    }

    @Override
    public Mono<Void> deleteAll(Publisher<? extends Post> publisher) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll() {
        return null;
    }
}
