package GenTypesList;

public class List<T> {
private Node<T>first,last;
public List() {
	first=last=null;
}
public List(T v) {
	first=last=new Node<T>(v);
}
public void push_front(T v) {
	if(first==null) {
		first=last=new Node<T>(v);
		return;
	}
	Node<T>t=new Node<T>(v,null,first);
	first.setPrev(t);
	first=t;
}
public void push_back(T v) {
	if(first==null) {
		first=last=new Node<T>(v);
		return;
	}Node<T>t=new Node<T>(v,last,null);
	last.setNext(t);
	last=t;
}
public void pop_front() throws NullPointerException{
	if(first==null) throw new NullPointerException();
	first=first.getNext();
	first.setPrev(null);
}
public void pop_back() throws NullPointerException {
	if(first==null) throw new NullPointerException();
	last=last.getPrev();
	last.setNext(null);
}
public Node<T> getFirst(){
	return first;
}
public Node<T> getLast(){
	return last;
}
public T getFront() throws NullPointerException {
	if(first==null) throw new NullPointerException();
	return first.getData();
}
public T getBack() throws NullPointerException{
	if(first==null) throw new NullPointerException();
	return last.getData();
}
public boolean isEmpty() {
	if(first==null) return true;
	return false;
}
public String toString() {
	if(first==null)return "null";
	String s="|";
	Node<T> t=first;
	do {
		s+=t.toString();
		t=t.getNext();
	}while(t!=null);
	s+="|";
	return s;
}
}
