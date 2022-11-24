
public class Ring<T> {
private class Node{
	T Data;
	Node next;
}
private Node first,last;
public Ring() {
	first=last=null;
}
public Ring (T a) {
	first=last=new Node();
	first.Data=a;
	first.next=first;
}
public T getFirst() throws NullPointerException{
	if (first==null) throw new NullPointerException();
	return first.Data;
}
public void setFirst(T a) throws NullPointerException{
	if(first==null) throw new NullPointerException();
	first.Data=a;	
}
public boolean findFirstVal(T a) {
	Node p=first;
	if(first==null)return false;
	do {
		if(first.Data==a) {
			return true;
		}
		first=first.next;
	}while(first!=p);
	return false;
}

public String toString() {
	String s="{";
	boolean b=false;
	Node p=first;
	while(p!=null) {
		if(b) {
			s+=",";
		}
	s+=p.Data.toString();
	b=true;
	p=p.next;
	if(p==first) break;
	}
	s+="}";
	return s;
}
public void add(T a) {
	Node p=first;
	first=new Node();
first.Data=a;
first.next=p.next;
p.next=first;
}
public void remove() throws NullPointerException{
	if(first==null) throw new NullPointerException();
	if(first.next==first) {
		first=null;
		return;
	}
	Node p=first,q;
	do {
		q=p;
		p=p.next;
	}while(p!=first);
	q.next=first.next;
	first=first.next;
}
}
