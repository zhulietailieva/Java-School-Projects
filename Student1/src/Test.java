
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student1 a=new Student1("Zhulieta",(byte)17);
Student1 b=new Student1("Ivan",(byte)26);
System.out.println(a.toString()+b.toString());
a.Swap(b);
System.out.println(a.toString()+b.toString());
System.out.println(b.less(b));
	}

}
