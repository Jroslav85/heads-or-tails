package com.jroslav.main.mvc;

import java.util.List;

import com.jroslav.main.figure.Figure;

public class Validator {
	private RandomnessGenerator randomnessGenerator;

	public Validator(RandomnessGenerator randomnessGenerator) {
		this.randomnessGenerator = randomnessGenerator;
	}

	public boolean idValid(String str) {
		List<Figure> list = randomnessGenerator.getFigures();
		for (Figure figure : list) {
			if (str.equalsIgnoreCase(figure.getName())) {
				return true;
			}
		}
		return false;
	}
}
