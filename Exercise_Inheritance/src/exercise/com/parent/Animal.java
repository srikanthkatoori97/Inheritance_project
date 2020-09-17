package exercise.com.parent;

public class Animal {
	protected Float height;
	protected int weight;
	protected String animaltype;
	protected String bloodtype;
	
	

	public Animal() {
		
		this.height = 0f;
		this.weight = 0;
		this.animaltype = "unknown";
		this.bloodtype = "unknown";
	}

	public Float getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getAnimaltype() {
		return animaltype ;
	}

	public String getBloodtype() {
		return bloodtype;
	}


	public String showInfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", animaltype=" + animaltype + ", bloodtype="
				+ bloodtype + "]";
	}
	
	

}
