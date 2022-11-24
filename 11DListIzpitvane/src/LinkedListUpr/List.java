package LinkedListUpr;

public class List {
private Node first;
public List() {
	first=null;
}
public List(int v) {
	first=new Node(v);
}
public void push_front(int v) {
	first=new Node(v,this.first);
}
public void pop_front()throws NullPointerException{
	if(first==null) throw new NullPointerException();
first=first.getLink();
}
public int getData()throws NullPointerException{
	if(first==null) throw new NullPointerException();
	return first.getData();
}
public String toString() {
	if(first==null) return"null";
	return ""+this.first;
}
}
