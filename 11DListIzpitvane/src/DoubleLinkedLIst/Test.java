package DoubleLinkedLIst;

public class Test {

	public static void main(String[] args) {
		Node n=new Node(6);
		System.out.println(n.toString());
		Node a=new Node(5);
		Node b=new Node(7);
		
List l=new List(6);
System.out.println(l.toString());
l.push_front(5);
System.out.println(l.toString());
l.push_back(9);
System.out.println(l.toString());
/*try {
	l.pop_back();System.out.println(l.toString());
}catch (Exception e) {
	System.out.println("No elements");
}
try {
	l.pop_front();System.out.println(l.toString());}catch(Exception e) {
	System.out.println("No elements");
}System.out.println(l.isEmpty());*/
try {
System.out.println(l.getData(2));}catch(Exception e){
	System.out.println("Invalid argument");
}
try {
	System.out.println(l.getNode(2));
}catch(Exception e) {
	System.out.println("Invalid argument");
}
l.setData(2, 27);
System.out.println(l.toString());
l.remove(l.getNode(2));
System.out.println(l.toString());
l.remove(1);
System.out.println(l.toString());
System.out.println(l.contains(5));
System.out.println(l.contains(6));
	}

}
