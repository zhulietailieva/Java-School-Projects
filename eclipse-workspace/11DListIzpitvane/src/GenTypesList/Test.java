package GenTypesList;

public class Test {

	public static void main(String[] args) {
		Node<Integer> a=new Node<Integer>(6);
		System.out.println(a.toString());
		Node<String>b=new Node<String>("zdr");
		System.out.println(b.toString());
List<String> n=new List<String>("kak e");
n.push_back("Mnoo dobre");
n.push_front("Brat");
System.out.println(n.toString()); 
System.out.println(n.getBack());
System.out.println(n.getFront());
System.out.println(n.getFirst());
System.out.println(n.getLast());
n.pop_back();
n.pop_front();
System.out.println(n.toString());
System.out.println(n.isEmpty());


}

}
