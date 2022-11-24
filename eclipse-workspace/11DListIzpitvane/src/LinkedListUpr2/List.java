package LinkedListUpr2;

public class List {
private Node first;
public List() {
	first=null;
}
public List(int v) {
	first=new Node(v);
}
public String toString() {
	if(first==null) return "null";
	return ""+first;
}
public int getFirst() {
	return first.getData();
}
public void push_front(int v) {
	first=new Node(v);
}
public void pop_front() throws NullPointerException{
	if(first==null)throw new NullPointerException();
	first=first.getLink();
}
public boolean isEmpty() {
	if(first==null) return true;
	return false;
}

}
