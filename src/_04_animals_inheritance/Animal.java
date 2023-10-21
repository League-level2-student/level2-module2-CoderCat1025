package _04_animals_inheritance;

public class Animal {
	String name;
	String color;
	boolean isFemale;
public Animal (String name, String color, boolean isFemale) {
	this.name = name;
	this.color = color; 
	this.isFemale = isFemale;
}

void printName() {
	System.out.println("My name is " + name);
}

void eat() {
	System.out.println("Eating");
}

void sleep() {
	System.out.println("Sleeping");
}
}
