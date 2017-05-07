package ua.training.helloworld_mvc;

import java.util.Scanner;

public class Controller {
	private Model model;
	private View view;

	static String required_hello = "Hello";
	static String required_world = "world!";

	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
	}

	public void process() {
		Scanner sc = new Scanner(System.in);
		String hello = (inputStringWithScanner(sc, required_hello));
		String world = (inputStringWithScanner(sc, required_world));
		setModel(hello, world);
		view.printHelloWorld(model);
	}
	
	private void setModel(String hello, String world) {
		model.setWord(hello, world);
	}

	private String inputStringWithScanner(Scanner sc, String pattern) {
		while (!sc.hasNext(pattern)) {
			sc.next();
			view.printErrorMessage(View.ERROR_INCORRECT_INPUT);
		}
		return sc.next();
	}

}
