package LinkedList;

public class Test {

	public static void main(String[] args) {
		Node n=new Node(5);
		System.out.println(n.toString());
		List a=new List(5);
			List b=new List();
		a.push_front(6);
		a.push_front(9);
		try{
			b.pop_front();
		
		}
		catch(Exception e){
			System.out.println("No elements");
		}
		System.out.println(a.toString());
	
		System.out.println(b.isEmpty());
		try {
		System.out.println(b.getData());}
		catch(Exception e) {
			System.out.println("No elements");
		}
		System.out.println(a.getCount());
		try {
		System.out.println(a.getDataAt(5));}catch(Exception e) {
			System.out.println("");
		}
	}

}
