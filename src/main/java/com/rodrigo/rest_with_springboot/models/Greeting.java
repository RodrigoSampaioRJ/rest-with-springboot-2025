package com.rodrigo.rest_with_springboot.models;

public class Greeting {
    private Long id;
    private String name;

    public Greeting() {
    }

    public Greeting(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
