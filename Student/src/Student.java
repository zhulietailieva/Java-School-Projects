
public class Student {
private String n1,n2,n3;
private EGN id;
public Student(String name1,String name2,String name3,String egn) {//�����������
	n1=name1;
	n2=name2;
	n3=name3;
	id=new EGN(egn);

}
public String toString(){
	   //������: ��� ������� �������, ���: 0000000000
	   return n1 + " "+n2 + " "+n3 + ", ���: " + id.getEGN(); 
	 }
//������
public String getName1() {
	return n1;
}
public String getName2() {
	return n2;
}
public String getName3() {
	return n3;
}
public String getEGN() {
	return id.getEGN();
}

}
