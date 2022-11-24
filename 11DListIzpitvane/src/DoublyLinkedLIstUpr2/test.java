package DoublyLinkedLIstUpr2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List n=new List(5);
System.out.println(n.toString());
n.push_front(50);n.push_front(6);
System.out.println(n.toString());
n.push_back(7);n.push_back(9);
System.out.println(n.toString());
System.out.println(n.getFirst());
System.out.println(n.getBack());
System.out.println(n.getFront());
System.out.println(n.contains(50));
System.out.println(n.contains(9));
System.out.println(n.contains(11));
System.out.println(n.getData(4));
System.out.println(n.getData(1));
System.out.println(n.getNode(2));
n.SetData(1, 48);	
System.out.println(n.toString());
//n.pop_back();n.pop_front();
n.remove(n.getNode(2));
System.out.println(n.toString());

System.out.println(n.toString());
System.out.println(n.toStringWatch());
n.swapValues(n.getNode(1), n.getNode(3));
System.out.println(n.toString());
System.out.println(n.toString1());
n.swap(n.getNode(0), n.getNode(3));
System.out.println(n.toString());
System.out.println(n.toString1());
n.qiuckSort();
System.out.println(n.toString1());
	}
	
	
	

}
