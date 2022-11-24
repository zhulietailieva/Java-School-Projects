package DoublyLinkedLIstUpr;

public class Test {

	public static void main(String[] args) {
		
List n=new List(5);
System.out.println(n.toString());
n.push_back(9);
System.out.println(n.toString());
n.pop_back();
System.out.println(n.toString());
n.push_front(9);
n.push_front(0);
System.out.println(n.toString());
n.pop_front();
System.out.println(n.toString());
System.out.println(n.getFirst());
System.out.println(n.getLast());
System.out.println(n.isEmpty());
List b=new List();
System.out.println(b.isEmpty());
	}

}
