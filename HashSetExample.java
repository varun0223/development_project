package collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> animals = new HashSet<>();
		
		animals.add("Dog");
		animals.add("Dolphin");
		animals.add("Lion");
		
		System.out.println("Does the set contain 'Dolphin'? " + animals.contains("Dolphin"));
		
		System.out.println("All animals:");
		for (String animal: animals) {
			System.out.println(animal);
			
		}
        
		animals.remove("Dog");
		System.out.println("After removal the animal: " + animals);
		
		
	}

}
