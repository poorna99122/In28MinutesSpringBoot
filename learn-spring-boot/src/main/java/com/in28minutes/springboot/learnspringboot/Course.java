package com.in28minutes.springboot.learnspringboot;

public class Course {

	private long Id;
	private String name;
	private String author;
	
	public Course(long id, String name, String author) {
		super();
		Id = id;
		this.name = name;
		this.author = author;
	}


	public long getId() {
		return Id;
	}


	public void setId(long id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}



	
	
	@Override
	public String toString() {
		return "Course [Id=" + Id + ", name=" + name + ", author=" + author + "]";
	}
	
}
