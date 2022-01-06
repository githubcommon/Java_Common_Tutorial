package com.murali.springboot.course.bean;

/**
 * @author:Sanapala Muralidharan
 * @date:Jan 6, 2022 11:41:08 AM
 * @version:2.x
 */
public class Course {

    private long id;
    private String name;
    private String author;

    public Course(long id, String name, String author) {
	super();
	this.id = id;
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
	return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }

}
