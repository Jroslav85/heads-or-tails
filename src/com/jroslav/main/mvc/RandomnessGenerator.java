package com.jroslav.main.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.jroslav.main.figure.Figure;

public class RandomnessGenerator {
	private List<Figure> figures;
	private Random random = new Random();

	public RandomnessGenerator(Figure... figures) {
		this.figures = fillList(figures);
	}

	private List<Figure> fillList(Figure... figures) {
		List<Figure> result = new ArrayList<>();
		for (int i = 0; i < figures.length; i++) {
			result.add(figures[i]);
		}
		return result;
	}

	public List<Figure> getFigures() {
		return figures;
	}

	public Figure randomFigure() {
		int limit = figures.size();
		Figure figure = figures.get(random.nextInt(0, limit));
		return figure;
	}
}
