package com.example;

public class HelloWorldAction {
    private String name;

    public String execute() throws Exception {
	return "success";
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	System.out.println(name);
	this.name = name;
    }
}