package exercise.com.animals;

import exercise.com.parent.Animal;

public class Fish extends Animal {

	private String livingplace;
	private boolean gills;
	public Fish() {
		super();
		height=2f;
		weight= 5;
		animaltype="fish";
		bloodtype="red";
		livingplace = "water";
		gills = true;
	}
	public String getLivingplace() {
		return livingplace;
	}
	public boolean isGills() {
		return gills;
	}
	
	public String showInfo() {
		return "Fish [livingplace=" + livingplace + ", gills=" + gills + ", height=" + height + ", weight=" + weight
				+ ", animaltype=" + animaltype + ", bloodtype=" + bloodtype + "]";
	}
	
	
}
