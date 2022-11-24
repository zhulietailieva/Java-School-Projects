
abstract public class Mammal extends Animal {
public Mammal(String n) {
	super(n);
}
	@Override
	public void eats() {
		// TODO Auto-generated method stub
System.out.println("Food: diverse");
	}

	@Override
	public void breathes() {
		// TODO Auto-generated method stub
		System.out.println("Breths: oxygen");
	}

	@Override
	public void moves() {
		// TODO Auto-generated method stub
		System.out.println("Moves: mainly walks");
	}

	@Override
	public void reprod() {
		// TODO Auto-generated method stub
		System.out.println("Repr: two sex");
	}

}
