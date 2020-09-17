package exercise.com.example;

import exercise.com.animals.Reptile;

public class Crocodile extends Reptile {

	
	
	
	public Crocodile() {
		super();
		eggtype = "Hard-shelled eggs";
	}

	

	public String getEggtype() {
		return eggtype;
	}



	public void showinfo() {
		System.out.println();
		
	}



	
	public String showInfo() {
		return "Crocodile [skintype=" + skintype + ", bonetype=" + bonetype + ", eggtype=" + eggtype + ", height="
				+ height + ", weight=" + weight + ", animaltype=" + animaltype + ", bloodtype=" + bloodtype + "]";
	}



	
}

