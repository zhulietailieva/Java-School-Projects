package DoublyLinkedLIstUpr;

public class List {
private Node first,last;
public List() {
	first=last=null;
}
public List(int v) {
	first=last=new Node(v);
}
public void push_front(int v){
	if(first==null) {
		first=last=new Node(v);return;
	}
	Node t=new Node(v,null,first);
	first.setPrev(t);
	first=t;
}
public void push_back(int v) {
	if(first==null) {
		first=last=new Node(v);return;
	}
	Node t=new Node(v,last,null);
	last.setNext(t);
	last=t;
}
public void pop_front()throws NullPointerException {
	if(first==null) throw new NullPointerException();
	first=first.getNext();
	first.setPrev(null);
}
public void pop_back() throws NullPointerException {
	if(first==null) throw new NullPointerException();
	last=last.getPrev();
	last.setNext(null);
}
public int getFirst() {
	return first.getData();
	
}
public int getLast() {
	return last.getData();
}
public boolean isEmpty() {
	if(first==null)return true;
	return false;
}
public String toString() {
	if(first==null) return "null";
	String s="|";
	Node t=first;
do {
	s+=t.toString();
	t=t.getNext();
}while(t!=null);
s+="|";
return s;
}
}
