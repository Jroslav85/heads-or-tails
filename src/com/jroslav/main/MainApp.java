package com.jroslav.main;

import java.util.Scanner;

import com.jroslav.main.figure.Heads;
import com.jroslav.main.figure.Tail;
import com.jroslav.main.mvc.Controller;
import com.jroslav.main.mvc.RandomnessGenerator;
import com.jroslav.main.mvc.Validator;
import com.jroslav.main.mvc.view.View;
import com.jroslav.main.mvc.view.ViewTwo;

// орел и решка 12.03.2024
public class MainApp {

	public static void main(String[] args) throws InterruptedException {
		try (Scanner console = new Scanner(System.in)) {
			View view = new ViewTwo();
			
			RandomnessGenerator randomnessGenerator = new RandomnessGenerator(
					new Tail(), new Heads());
			Validator validator = new Validator(randomnessGenerator);
			Controller controller = new Controller(view, randomnessGenerator);
			
			System.out.println("орел или решка?");
			while (true) {
				String inStr = console.nextLine();
				if (validator.idValid(inStr)) {
					System.out.println("⌛");
					Thread.sleep(1000);
					controller.setAnswerUser(inStr);
					break;
				}
				System.out.println("ошибка ввода, орел или решка");
			}
			System.out.println(controller.getAnswer());
		}
	}
}
