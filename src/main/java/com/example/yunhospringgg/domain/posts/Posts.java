package com.example.yunhospringgg.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEST", nullable = false)
    private String context;

    private String author;

    @Builder
    public Posts(String title, String context, String author){
        this.title = title;
        this.context = context;
        this.author = author;
    }
}
