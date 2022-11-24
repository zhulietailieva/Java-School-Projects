package LinkedListUpr2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List n=new List(6);
System.out.println(n.toString());
Node b=new Node(6);
System.out.println(b.toString());
n.pop_front();
System.out.println(n.isEmpty());
System.out.println(n.toString());
try {
	n.pop_front();System.out.println(n.toString());
}catch(Exception e){
	System.out.println("No elements");
}
n.push_front(5);n.push_front(9);
System.out.println(n.toString());
System.out.println(n.isEmpty());
	}

}
