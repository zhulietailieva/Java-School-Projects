package autom;

public interface Callback {
	default public void proceed(String s){
		 System.out.println(s);//�� ������������ � ����� �� ����������� �����,
		 // ������� �� ��� ���
		}
}
