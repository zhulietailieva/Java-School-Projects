import java.io.*;
public class Test {
public static void main(String[] args) throws IOException {
File f=new File("people.dat");
if (f.exists()) f.delete(); //��� ������ ���������� - ������� ��
//��� ���� �� ���������� ������
FileEditor fe = new FileEditor("people.dat");
//�������� �� ������
fe.addRecord(new PersonRecord(1, "Ivan", "0887657553",
"ivan@abv.com"));
fe.addRecord(new PersonRecord(2, "Pesho", "0888638455",
"pesho@mail.bg"));
fe.addRecord(new PersonRecord(3, "Mimi", "0876377609",
"mimi@gmail.com"));
fe.addRecord(new PersonRecord(4, "����", "0877778209",
"choch@hotmail.com"));
fe.showAllRecords(); //��������� �� ������ ������
System.out.println("----------------------------------");
//������� �� ����� � ID=4
fe.updateRecord(new PersonRecord(4,"Anna","0899202034",
"an_234@abv.bg"));
fe.showAllRecords();//��������� �� ������ ������
System.out.println("----------------------------------");
//��������� �� ����� �� �����
fe.deleteRecord(new PersonRecord(3, "Mimi", "0876377609",
"mimi@gmail.com"));
fe.showAllRecords();//��������� �� ������ ������
fe.close();
}
}
