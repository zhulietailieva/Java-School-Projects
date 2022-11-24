package LinkedListUpr2;

public class Node {
private int data;
private Node link;
public Node(int v) {
	data=v;
	link=null;
}
public Node(int v,Node n) {
	data=v;link=n;
}
public String toString() {
	String s="{ ";
	Node t=this;
	while(t!=null) {
		s+=t.data+" ";
		t=t.link;
	}
	s+="}";
	return s;
}
public int getData() {
	return data;
}
public void setData(int v) {
	data=v;
}
public Node getLink() {
	return link;
}
}
