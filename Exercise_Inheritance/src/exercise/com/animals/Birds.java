package exercise.com.animals;

import exercise.com.parent.Animal;

public class Birds extends Animal {
	private boolean  feathers ;
	private boolean fly;
	public Birds() {
		super();
		height=1f;
		weight=3;
		animaltype="birds";
		bloodtype="red";
		this.feathers = true;
		this.fly = true;
	}
	public boolean isFeathers() {
		return feathers;
	}
	public boolean isFly() {
		return fly;
	}
	
	public String showInfo() {
		return "Birds [feathers=" + feathers + ", fly=" + fly + ", height=" + height + ", weight=" + weight
				+ ", animaltype=" + animaltype + ", bloodtype=" + bloodtype + "]";
	}
	
	

}
