package com.jroslav.main.mvc.view;

import com.jroslav.main.figure.Figure;

public class ViewOne implements View {
	
	public void showFigure(Figure figure) {
		System.out.println(figure);
	}
}
