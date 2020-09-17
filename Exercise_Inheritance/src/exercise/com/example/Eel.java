package exercise.com.example;

import exercise.com.animals.Fish;

public class Eel extends Fish {
	
	String electriccharge;

	public Eel() {
		super();
		this.electriccharge = "releases";
	}

	public String getElectriccharge() {
		return electriccharge;
	}

	
	public String showInfo() {
		return "Eel [electriccharge=" + electriccharge + ", height=" + height + ", weight=" + weight + ", animaltype="
				+ animaltype + ", bloodtype=" + bloodtype + "]";
	}
	
	
	
	

}
