package com.jroslav.main.mvc;

import com.jroslav.main.figure.Figure;
import com.jroslav.main.mvc.view.View;

public class Controller {
	private RandomnessGenerator randomnessGenerator;
	private String answerUser;
	private View view;

	public Controller(View view, RandomnessGenerator randomnessGenerator) {
		this.view = view;
		this.randomnessGenerator = randomnessGenerator;
	}

	public boolean getAnswer() {
		Figure figure = randomnessGenerator.randomFigure();
		view.showFigure(figure);
		return figure.getName().equalsIgnoreCase(answerUser);
	}

	public void setAnswerUser(String answer) {
		this.answerUser = answer;
	}
}
