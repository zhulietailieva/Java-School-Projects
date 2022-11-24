package LinkedList;

public class Node {
int data;
Node link;
public Node(int v) {
	data=v;
	link=null;
}
public Node(int v,Node n) {
	data=v;link=n;
}
public int getData() {
	return data;
}
/*public Node push_front(int v) {
	return new Node(v,this);
}
public Node pop_front() {
	return link;
}*/
public String toString() {
	String s="{ ";
	Node t=this;
	while(t!=null) {
		s+=t.getData()+" ";
	t=	t.link;
	}
	s+="}";
	return s;
}
}
