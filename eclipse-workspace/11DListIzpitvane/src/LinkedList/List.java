package LinkedList;

public class List {
private Node first;
public List() {
	first=null;
}
public List(int v) {
	first=new Node(v);
}
public void push_front(int v) {
	first=new Node(v,first);
}
	public Node getFirst() {
return first;
}
		public void pop_front() throws NullPointerException{
if(first==null) throw  new NullPointerException();
first=first.link;
}
	public String toString() {
	if(first==null) return "null";
				return first.toString();
}
			public boolean isEmpty() {
if(first==null) return true;
return false;
}
public int getData() throws NullPointerException {
			if(first==null) throw new NullPointerException();
	return first.data;	
			}
public int getCount() {
	int c=0;
	Node t=first;
	while(t!=null) {
		c++;
		t=t.link;
	}
	return c;
}
public int getDataAt(int p) throws  IllegalArgumentException{
	if(p>this.getCount())throw new IllegalArgumentException();
	for (int i = 0; i <p; i++) {
		first=first.link;
	}
	return first.data;
}


}
