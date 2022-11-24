package DoubleLinkedLIst;

public class Node {
private int data;
private Node prev,next;
public Node(int v) {
	prev=next=null;
	data=v;
}
public Node(int v,Node p,Node n) {
	prev=p;
	data=v;
	next=n;
}
public Node getPrev() {
	return prev;
}
public int getData() {
	return data;
}
public Node getNext() {
	return next;
}
public void setNext(Node n) {
	next=n;	
}
public void setPrev(Node p) {
	prev=p;	
}
public void setData(int v) {
	data=v;	
}

public String toString() {
	String s="{";
	if(prev==null) s+="null";
	else s+=prev.data;
	s+="<-"+data+"->";
	if(next==null) s+="null";
	else s+=next.data;
	s+="}";
	return s;
	
}
}
