package com.springboot.demo.entity;

public enum Role {

    EDIT("edit"),
    VIEW("view"),
    NO_ACCESS("noaccess");
    private final String name;

   private Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
