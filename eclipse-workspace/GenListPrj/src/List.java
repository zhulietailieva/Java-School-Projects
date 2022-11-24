
public class List<T> {
private Node<T> first,last;
public List(){
	first=last=null;
}
public List(T v) {
	first=last=new Node<T>(v);
}
public void push_front(T v) {
	if(first==null) {
		first=last=new Node(v);
		return;
	}
	Node <T>t=new Node<T>(v,null,first);
	first.setPrev(t);
	first=t;
}
public void push_back(T v) {
	if(first==null) {
		first=last=new Node<T>(v);
	}
	else {
		Node<T> t=new Node<T>(v,last,null);
		last.setNext(t);
		last=t;
	}
}
public String toString() {
	String s="";
	Node<T> t=first;
	while(t!=null) {
		if(!s.equals("")) s+=", ";
		s+=t.getData();
		t=t.getNext();
	}
	s="{"+s+"}";
	return s;
}
public void pop_front() throws NullPointerException{
	if(first==null) throw new NullPointerException();
	first=first.getNext();
	if(first==null) last=null;
	else last.setNext(null);	
}
public void pop_back()throws NullPointerException{
	if(last==null) throw new NullPointerException();
	last=last.getPrev();
	if(last==null) first=null;
	else {
		last.setNext(null);
	}
}

}
