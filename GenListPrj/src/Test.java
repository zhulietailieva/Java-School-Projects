
public class Test {

	public static void main(String[] args) {
		
Node <Integer> a= new Node<Integer>(new Integer(5));
System.out.println(a.toString());
	
	Node <String>b=new Node<String>(new String("B"));
	System.out.println(b.toString());
Node<Fraction>f=new Node<Fraction>(new Fraction(2,6));
System.out.println(f.toString());
	
	List<String> s=new List<String>("Koko");
	System.out.println(s.toString());
	List<Fraction> F=new List<Fraction>(f.getData());
	System.out.println(F.toString());
	
	for (char i='A';i<='Z';i++) {
		s.push_front(i+"");
		}
	
	System.out.println(s.toString());
	try {
		s.pop_front();
		System.out.println(s.toString());
	}catch(Exception e) {
		System.out.println("No elements");
	}
	try {
	s.pop_back();
	System.out.println(s.toString());}
	catch(Exception e) {
		System.out.println("No elements");
	}
}}
