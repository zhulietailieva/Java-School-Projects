
public class Cat extends Mammal {
public Cat(String n) {
	super(n);
}
public void eats() {
	System.out.println("Eats: mice");
}
public void moves() {
	System.out.println("Moves: walks");
}
public void breathes() {
	System.out.println("Breaths: oxygen");
}
public void reprod() {
	System.out.println("Reprod: two sex");
}
public String toString() {
	return getName();
}
}
