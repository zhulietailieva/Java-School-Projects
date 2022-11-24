
public class Student1 implements ToSwap<Student1>,Compare<Student1> {
private String n;
private byte age;
public Student1(String name,int age) {
	n=name;
	this.age=(byte)age;
}
public byte getAge() {
	return age;
}
public String getName() {
	return n;
}
public String toString() {
	String s="{"+n+"-"+age+"}";
	return s;
}
public void Swap(Student1 a) {
	String s=a.n;
	byte b=a.age;
	a.n=this.n;
	this.n=s;
	a.age=this.age;
	this.age=b;
}
public boolean less(Student1  s) {
	if(this.age==s.age) {
		return n.compareTo(s.n)<0;
	}
	return this.age<s.age;
}
@Override
public void swap(Student1 n) {
	// TODO Auto-generated method stub
	
}
}
