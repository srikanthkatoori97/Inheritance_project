package exercise.com.animals;

import exercise.com.parent.Animal;

public class Reptile extends Animal {
	/*private String skintype ="Dryskin";
	private String bonetype ="backbone";
	private String eggtype ="soft-shelled egg";*/
	
	protected String skintype;
	protected String bonetype ;
	protected String eggtype ;
	
	public Reptile() {
		super();
		height = 5f;
		weight =20;
		animaltype="reptile";
		bloodtype ="c";
		this.skintype = "Dryskin";
		this.bonetype = "backbone";
		this.eggtype = "soft-shelled egg";
	}

	public String getSkintype() {
		return skintype;
	}

	public String getBonetype() {
		return bonetype;
	}

	public String getEggtype() {
		return eggtype;
	}

	
	public String showInfo() {
		return "Reptile [skintype=" + skintype + ", bonetype=" + bonetype + ", eggtype=" + eggtype + ", height="
				+ height + ", weight=" + weight + ", animaltype=" + animaltype + ", bloodtype=" + bloodtype + "]";
	}

	
	
	

}
