package com.jroslav.main.mvc.view;

import com.jroslav.main.figure.Figure;

public class ViewTwo implements View {

	@Override
	public void showFigure(Figure figure) {
		System.out.println(">>> " + figure + " <<<");
	}
}
