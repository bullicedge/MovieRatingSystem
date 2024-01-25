package com.springboot.demo.entity;

public enum Role {

    Edit("edit"),
    View("view"),
    NoAccess("noaccess");
    String name;

    Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
