package zadachi;

public class Hanoi {
static int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hanoi(3,'A','C','B');
System.out.println("you have to make "+ cnt +" moves");
	}
public static void Hanoi(int n, char from,char to,char using)//��������� ������ �� ����� �� ������, ������, � ����� �� ������ � ������� ������
{
	if(n==1) { System.out.println("move a disc from "+ from+" to "+to);cnt+=1;return;}//��� �������� ��� ���� ���� ����, ������� �� ������, "return" - ��������
Hanoi(n-1,from,using,to);//����������� ��������� ��� ������ �� ������� � ��������� ������
System.out.println("move a disc from "+from+" to "+to);
Hanoi(n-1,using,to,from);//����������� ��������� �� ��������� � ������� ������
cnt++;
}
}
