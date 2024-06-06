package com.manav.springboot.learn_spring_boot;

public class Course {
    private final long id;
    private final String name;
    private final String author;

    public Course(int sNumber, String name, String author) {
        this.id = sNumber;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
