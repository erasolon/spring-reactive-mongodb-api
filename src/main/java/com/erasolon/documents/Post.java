package com.erasolon.documents;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    private ObjectId id;
    @NonNull
    private String username;
    @NonNull
    private String topic;
    private LocalDateTime time = LocalDateTime.now();
    @NonNull
    private String message;

}
