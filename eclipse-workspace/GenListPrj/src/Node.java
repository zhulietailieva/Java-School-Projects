
public class Node<T> {
private T data;
private Node<T> prev,next;

public Node(T v) {
	data=v;
	prev=next=null;
}
public Node (T v,Node<T> p,Node<T>n) {
	data=v;
	prev=p;
	next=n;
}
public T getData() {
	return data;
}
public void  setData(T v) {
	data=v;
}
public Node<T> getPrev() {
	return prev;
}
public Node<T> getNext() {
	return next;
}
public void setPrev(Node<T>p) {
	prev=p;
}
public void setNext(Node<T>n) {
	next=n;
}
public String toString(){
	  String s="";
	  if (prev==null) s="null";
	  else s=""+prev.data;
	  s+="<-"+data+"->";
	  if (next==null) s+="null";
	  else s+=next.data;
	  return s;
	 }
}
