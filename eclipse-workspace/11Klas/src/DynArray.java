
//���� ��������� �����
public class DynArray {
	//���������-������ �� ������������
private static final int INCSIZE=16;
//��������
private int[] data;//����� �� �����
private int size,count;//������ �������� � ����� ���� ��������
public DynArray(){ //����������� �� ������ ����� � ����� �� INCSIZE ��������
 data=new int[INCSIZE];
 size=INCSIZE;
 count=0;
}
//����� �� �������� ������ �� ������
public void push_back(int v){
 if (count>=size){ //��� ���� ���� �����...
 size+=INCSIZE; //... ����������� ����� � INCSIZE,...
 int[] t=new int[size];//... �������� ���� �����,...
 for (int i=0;i<count;i++) t[i]=data[i]; //...��������� ������� �����,...
 data=t; //... � ���������� ���������� data.
 }
 data[count++]=v; //�������� ����� ������� �� ����� count � ����������� count � ����.
}
public void insert(int n, int v) throws ArrayIndexOutOfBoundsException {
	if(n==count) {
		push_back(v); return;
	}
	if(n>count) throw(new ArrayIndexOutOfBoundsException());
	if(count==size) push_back(v);
	for (int i = count-1; i>n; i--) {
		data[i]=data[i-1];
		data[n]=v;		
	}
}

//������ �� n-��� �������
public int get(int n)throws ArrayIndexOutOfBoundsException
{//��� n � ����� [0, size), ������������ �� �� �������� �� ���������.
 //�� ������ �� �� �������� ���������� � ������ count<=n<size !
 if (n>=count) throw(new ArrayIndexOutOfBoundsException());
 return data[n];
}
//������� �� ���������� �� n-��� ������ �� v
//���������� � ����������� "����������"
public void set(int n,int v) throws ArrayIndexOutOfBoundsException
{//��� n � ����� [0, size), ������������ �� �� �������� �� ���������.
 //�� ������ �� �� �������� ���������� � ������ count<=n<size !
 if (n>=count) throw(new ArrayIndexOutOfBoundsException());
 data[n]=v;
}
public int getCount(){
 return count;
}
public int getSize(){
 return size;
}

@Override
public String toString(){
 String s="{ ";
 for (int i=0;i<count;i++) s+=data[i]+" ";
 return s + "}";
}
}
