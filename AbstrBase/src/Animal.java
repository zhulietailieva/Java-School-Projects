
abstract public class Animal {
private String name;
public String getName() {
	return name;
}
public Animal(String n) {
	name=n;
}
abstract public void eats();
abstract public void breathes();
abstract public void moves();
abstract public void reprod();
public String toString() {
	return name;
}
}
