package ua.training.helloworld_mvc;

public class View {
	static String ERROR_INCORRECT_INPUT = "Incorrect input, please try again.";
	
	public void printHelloWorld(Model model) {
		System.out.println(model.getHello() + " " + model.getWorld());
	}
	
	public void printErrorMessage(String errorMessage){
		System.err.println(errorMessage);
	}
}
