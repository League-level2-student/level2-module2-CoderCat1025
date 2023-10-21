package _04_animals_inheritance;

public class Dog extends Animal{

	public Dog(String name, String color, boolean isFemale) {
		super(name, color, isFemale);
		// TODO Auto-generated constructor stub
	}
	void play() {
System.out.println("I play with a ball (not made of yarn).");
	}
}
