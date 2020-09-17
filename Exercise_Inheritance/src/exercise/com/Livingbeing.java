package exercise.com;

import exercise.com.animals.Birds;
import exercise.com.animals.Fish;
import exercise.com.animals.Reptile;
import exercise.com.example.Crocodile;
import exercise.com.example.Eagle;
import exercise.com.example.Eel;
import exercise.com.parent.Animal;

public class Livingbeing {

	public static void main(String[] args) {
		Animal animal =new Animal();
		System.out.println(animal.showInfo());
		System.out.println();
		
		Reptile reptile =new Reptile();
		System.out.println("reptile information " +reptile.showInfo());
		System.out.println();
		Crocodile crocodile =new Crocodile();
		System.out.println(crocodile.showInfo());
		
		Birds birds =new Birds();
		System.out.println();
		System.out.println(birds.showInfo());
		System.out.println();
		Eagle eagle =new Eagle();
		System.out.println(eagle.showInfo());
		System.out.println();
		 
		Fish fish =new Fish();
		System.out.println(fish.showInfo());
		
		Eel eel =new Eel();
		System.out.println();
		System.out.println(eel.showInfo());
	//	System.out.println(birds.feathers); 
		
		
		
		
	}

}
