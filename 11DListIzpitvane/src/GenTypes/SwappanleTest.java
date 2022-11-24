package GenTypes;

public class SwappanleTest {

	public static void main(String[] args) {
		Swappable<Integer>a=new Swappable<Integer>(6,3);
		System.out.println(a.toString());
		a.swap();
		System.out.println(a.toString());
	}

}
