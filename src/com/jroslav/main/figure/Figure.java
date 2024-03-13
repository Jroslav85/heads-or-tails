package com.jroslav.main.figure;

public abstract class Figure {
	protected String image;
	protected String name;

	@Override
	public String toString() {
		return image;
	}

	public String getName() {
		return name;
	}
}
