package Izitvane;

public class SortedAssoTripple<T> {
private class Element <T>{
	private String n;
	private T v;
	int index;
	public Element(String name, T value,int i) {
		n=name; v=value;index=i;
	}
	public T getValue() {
		return v;
	}

	public void setValue(T value) {
		v=value;
	}
	public String getName() {
		return n;
	}
	public int getIndex(){
		return index;
		}
	public String toString() {
		String s=""+n+":"+v+";";
		return s;
	}
	}
	private String n1,n2,n3;
	private T v1,v2,v3;
	
public SortedAssoTripple(String name1,T value1,String name2,T value2,String name3,T value3) {
	n1=name1;n2=name2;n3=name3;
	v1=value1;v2=value2;v3=value3;
}
private Element<T> e1=new Element<T>(n1,v1,0);
private Element<T> e2=new Element<T>(n2,v2,1);
private Element<T> e3=new Element<T>(n3,v3,2);
public void setValue(int n,T v) throws IllegalArgumentException {
	if(n<1||n>3) throw new IllegalArgumentException();
	if(e1.getIndex()==n) e1.setValue(v);
	if(e2.getIndex()==n) e2.setValue(v);
	if(e3.getIndex()==n) e3.setValue(v);
}
private void swapv(Element<T> a,Element<T> b) {
	Element<T> t= a;
	a=b;
	b=t;
}
private boolean isAfirst(String a,String b) {
	int l=a.length()-b.length();
	if(l<=0)l=a.length();
	else l=b.length();
	for (int i = 0; i < l; i++) {
		if(a.charAt(i)-'0'>b.charAt(i)-'0') {
			return true;
		}
		else if(a.charAt(i)-'0'<b.charAt(i)-'0') {
			return false;
		}
	}
if(	l==b.length()) return false;
return true;
}
private String sortt(Element<T> a,Element<T> b,Element<T> c) {
String as=a.getName();
String bs=b.getName();
String cs=c.getName();
	String s="";
		boolean r=isAfirst(as,bs);
		if(!r) swapv(a,b);
		r=isAfirst(bs,cs);
		if(!r)swapv(b,c);
		r=isAfirst(as,bs);
		if(!r)swapv(a,b);	
		s+="{"+e1.getName()+": "+e1.getValue()+";"+e2.getName()+": "+
		e2.getValue()+";"+e3.getName()+": "+e3.getValue()+"}";
		return s;
}
private String myArray(Element<T>a,Element<T>b,Element<T>c) {
	String res="";
	String aS=a.getName();String bS=b.getName();String cS=c.getName();
	String []myArray= {aS,bS,cS};
	int size=myArray.length;
	for(int i=0;i<size-1;i++) {
		for (int j = 0; j < myArray.length; j++) {
			if(myArray[i].compareTo(myArray[j])>0) {
				String temp=myArray[i];
				myArray[i]=myArray[j];
				myArray[j]=temp;
			}
		}
	}
	for (int i = 0; i < myArray.length; i++) {
		res+=myArray[i];
	}
	return res;
}
public String SortedN() {
String s=	myArray(e1,e2,e3);
return s;
}

public String toString() {
	String res=sort();
	return res;
}
public String toString1() {
	String s=sortt(e1,e2,e3);
	return s;
}
}