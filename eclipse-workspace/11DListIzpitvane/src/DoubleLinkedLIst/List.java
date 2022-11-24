package DoubleLinkedLIst;

public class List {
	private Node first,last;
	
	
public List() {
	first=last=null;
}
public List(int v) {
	
	first=last=new Node(v);
}
public List(List L) {//Копи-конструктор
first=last=null;
Node t=first;
while(t!=null) {
	push_back(t.getData());t=t.getNext();
}
}
//Достъп до елемент с №n
public int getData(int n) throws IllegalArgumentException {
	if(n<0)throw new IllegalArgumentException();
	Node t=first;
	do {
		if(t==null) throw new IllegalArgumentException();
		if(n==0) return t.getData();
		n--;
		t=t.getNext();
	}while(true);
}
//Промяна на елемент с №
public void setData(int n,int v)throws IllegalArgumentException {
	if(n<0) throw new IllegalArgumentException();
	Node t=first;
	do {
		if(t==null) throw new IllegalArgumentException();
		if(n==0) { t.setData(v); return;}
		n--;
		t=t.getNext();
	}while(true);
}
//Достъп до възел с №n
public Node getNode(int n) throws IllegalArgumentException{
	if(n<0)throw new IllegalArgumentException();
	Node t=first;
	do {
		if(t==null)throw new IllegalArgumentException();
		if(n==0)return t;
		n--; t=t.getNext();
	}while(true);
}
//Премахване на елемент по указател
public void remove(Node n) throws NullPointerException{
	if(n==null||first==null) throw new NullPointerException();
	if(n==first) {pop_front(); return;}
	if(n==last) {pop_back();return;}
	n.getPrev().setNext(n.getNext());
	n.getNext().setPrev(n.getPrev());	
}
//Премахване на елемент по номер
public void remove(int n)throws IllegalArgumentException{
	if(n<0)throw new IllegalArgumentException();
	Node t=first;
	if(t==null)throw new IllegalArgumentException();
	do {
		if(n==0) { pop_front();return;}
		n--;
		t=t.getNext();
	}while(t!=null);
	throw new IllegalArgumentException();
	}
//Присъствие на елемент в списъка
public boolean contains(int v) {
	boolean b=false;
	Node t=first;
	while(t!=null) {
		if(t.getData()==v) {
			b=true; break;
		}
		t=t.getNext();
	}
	return b;
}
public void push_front(int v) {
	if(first==null) {
		first=last= new Node(v);
		return;
	}
	Node t=new Node(v,null,first);
	first.setPrev(t);
	first=t;
	}
public void push_back(int v) {
	if(first==null) {
		first=last=new Node(v);
		return;
	}
	Node t=new Node(v,last,null);
	last.setNext(t);
	last=t;
}
public void pop_front() throws NullPointerException{
	if(first==null) throw new NullPointerException();
	first=first.getNext();
	first.setPrev(null);
}
public void pop_back()throws NullPointerException{
	if(first==null) throw new NullPointerException();
	last=last.getPrev();
	last.setNext(null);
}

public boolean isEmpty() {
	if(first==null)return true;
	return false;
}
public int getFront() throws NullPointerException{
	if(first==null) throw new NullPointerException();
	return first.getData();
}
public int getBack() throws NullPointerException{
	if(first==null)throw new NullPointerException();
	return last.getData();
}
public String toString(){
	if (first==null) return "null";
	String s="|";
Node t= first;
do {
	s+=t.toString()+"|";
	t=t.getNext();
}while(t!=null);
return s;
	 }

	
}
