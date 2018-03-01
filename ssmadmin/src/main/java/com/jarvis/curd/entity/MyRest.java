package com.jarvis.curd.entity;

import org.springframework.hateoas.config.EnableEntityLinks;

@EnableEntityLinks
public class MyRest {
    private final long id;
    private final String content;

    public MyRest(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
