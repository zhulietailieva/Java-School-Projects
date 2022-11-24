package DoublyLinkedLIstUpr2;

public class List {
private Node first,last;
public List() {
	first=last=null;
}
public List(int v) {
	first=last=new Node(v);
}
public List(List L) {
	first=last=null;
	Node t=L.first;
	while(t!=null) {
		push_front(t.getData());
	t=	t.getNext();
	}
}
public void push_front(int v) {
	if(first==null)first=last=new Node(v);
	Node t=new Node(v,null,first);
	first.setPrev(t);;
	first=t;
}
public void push_back(int v) {
	if(first==null)first=last=new Node(v);
	Node t=new Node(v,last,null);
	last.setNext(t);
	last=t;
}
public void pop_front()throws NullPointerException {
	if(first==null)throw new NullPointerException();
	first=first.getNext();
	first.setPrev(null);
}
public void pop_back() throws  NullPointerException{
	if(first==null)throw new NullPointerException();
	last=last.getPrev();
	last.setNext(null);
}
public Node getFirst() {
	return first;
}
public Node getLast() {
	return last;
}
public int getFront() {
	return first.getData();
}
public int getBack() {
	return last.getData();
}
public boolean isEmpty() {
	if(first==null)return true;
	return false;
}
public boolean contains(int v) {
	boolean b=false;
	Node t=first;
	do {
		if(t.getData()==v) {
			b=true;break;
		}
		t=t.getNext();
	}while(t!=null);
	return b;
}
public int getData(int n) throws IllegalArgumentException {
	if(n<0||first==null) throw new IllegalArgumentException();
	Node t=first;
	do {
		if(n==0) return t.getData();
		n--;
		t=t.getNext();
	}while(true);
}
public Node getNode(int n)throws IllegalArgumentException {
	if(n<0) throw new IllegalArgumentException();
	Node t=first;
	do {
		if(t==null)throw new IllegalArgumentException();
		if(n==0)return t;
		n--;t=t.getNext();
		
	}while(true);
}
public void SetData(int n,int v) throws IllegalArgumentException{
	if(n<0)throw new IllegalArgumentException();
	Node t=first;
	do {
		if(t==null)throw new IllegalArgumentException();
		if(n==0) { t.setData(v);return;}
		n--; t=t.getNext();
	}while(true);
}
public void remove(int n)throws IllegalArgumentException {
	
	Node t=first;
	if(n<0||t==null)throw new IllegalArgumentException();
	do {
		if(n==0) { remove(t);return;}
		n--;
		t=t.getNext();
	}while(t!=null);
	throw new IllegalArgumentException();
	}
public void remove(Node n)throws NullPointerException {
	if(n==null||first==null) throw new NullPointerException();
	if(n==first) pop_front();
	if(n==last)pop_back();
	n.getPrev().setNext(n.getNext());
	n.getNext().setPrev(n.getPrev());
}
public String toString() {
	if(first==null) return "null";
	String s="|";
	Node t=first;
	do {
		s+=t.toString()+"|";
		t=t.getNext();
	}while(t!=null);
	return s;
}
public String toStringWatch() {
	if(first==null) return "null";
	Node t=first;
	String s="|";
	do {
		s+=t.toString()+"|";
		t=t.getNext();
	}while(t!=null);
	return s;
}
public String toString1() {
	String s="";Node t=first;
	while(t!=null) {
		if(!s.equals(""))s+=", ";
		s+=t.getData();
		t=t.getNext();
	}s= "{"+s+"}";
	return s;
}
//Размяна на стойностите на елементите
public void swapValues(Node a,Node b)throws IllegalArgumentException {
	if(a==null||b==null)throw new IllegalArgumentException();
	int t=a.getData();
	a.setData(b.getData());
	b.setData(t);
}
//Размяна на елементите в списъка
public void swap(Node a,Node b)throws IllegalArgumentException{
	if(a==null||b==null) throw new IllegalArgumentException();
	if(a==b)return;
	Node t;
	push_front(0);push_back(0);
	if(a.getNext()==b||b.getNext()==a) {
		if(b.getNext()==a) {
			t=a;a=b;b=t;}
		Node p1=a.getPrev();
		Node p2=b.getNext();
		p1.setNext(b);
		p2.setPrev(a);
		a.setPrev(b);
		b.setNext(a);
		a.setNext(p2);
		b.setPrev(p1);
		pop_back();pop_front();return;
	}
	a.getPrev().setNext(b);
	a.getNext().setPrev(b);
	b.getNext().setPrev(a);
	b.getPrev().setNext(a);
	t=a.getPrev();
	a.setPrev(b.getPrev());
	b.setPrev(t);
	t=a.getNext();
	a.setNext(b.getNext());
	b.setNext(t);
	pop_back();pop_front();
}
//Сортиране в нарастващ ред
private Node findKey(Node begin,Node end) {
	boolean f=true;
	while(begin!=end) {
		if(begin.getData()>end.getData()) {
			swapValues(begin,end);
			f=!f;
		}
		if(f)begin=begin.getNext();
		else end=end.getPrev();
	}
	return begin;
}
private void qsort(Node p,Node q) {
	if(p==q)return;
	Node t=findKey(p,q);
	if(t!=p) qsort(p,t.getPrev());
	if(t!=q)qsort(t.getNext(),q);
}
public void qiuckSort() {
	qsort(first,last);
}

}
