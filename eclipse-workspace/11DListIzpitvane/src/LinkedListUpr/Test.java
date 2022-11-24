package LinkedListUpr;

public class Test {

	public static void main(String[] args) {
		List a=new List(7);a.push_front(5);
		System.out.println(a.toString());
	try {
	a.pop_front();
	System.out.println(a.toString());
	
	}catch(Exception e) {
		System.out.println("No elements");
	}
	}

}
