package LinkedListUpr;

public class Node {
private int data;
private Node link;
public Node(int v) {
	data=v;
	link=null;
}
public Node(int v,Node n) {
	data=v;
	link=n;
}
public int getData() {
return data;
}
public Node getLink() {
	return link;
}
public void setData(int v) {
	data=v;
}

public String toString() {
	String s="{ ";
	Node t=this;
	do {
		s+=t.data+" ";
		t=t.link;
	}while(t!=null);
	s+="}";
	return s;
}
}
