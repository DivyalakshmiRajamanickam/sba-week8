package com.github.perscholas.model;

// TODO - Annotate and Implement respective interface and define behaviors
public class Course implements CourseInterface{

    private String id;
    private String name;
    private String instructor;


    public Course(String id, String name, String instructor) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
    }

    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getInstructor() {
        return null;
    }

    @Override
    public void setId(Integer id) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setInstructor(String instructor) {

    }
}
