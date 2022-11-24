import autom.*;//��������� �� ������������ � ������ ��������� � ��� �������
//���� �� ������������� �� ������������� ������� proceed
// (� ������ � ������ ������� �� ���� ���������� �� �����)
class Callback1 implements Callback{
static int n=0;
@Override
public void proceed(String s) {
 System.out.print(++n+": ");
 Callback.super.proceed(s);
}
}

public class Main {

	public static void main(String[] args) {
		 try{
		 Automaton a=new Automaton("Zad2Juja.txt");
		 //������� ������ ������������ ����, ������� ���� ��������, ���� ����� ���� ����
		 // ���������� �� ������� �� ��� ����� (� ������ � ��������� �� ����������� ����� �
		 // ����������� �� �����)
		 a.makeWords(5, new Callback1());
		 }catch (Exception e){
		 System.out.println("File not found");
		 }
		}

}
