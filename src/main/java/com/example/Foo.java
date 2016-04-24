package com.example;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Foo implements Serializable {

	private long id;

	private String name;

	public Foo(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
