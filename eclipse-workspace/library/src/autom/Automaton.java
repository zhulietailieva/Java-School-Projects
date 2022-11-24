package autom;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Automaton implements Callback {
	// �������� � ����������
		private int posCnt;//���� ���������
		private ArrayList<Integer> finPos=new ArrayList<Integer>();//������ �� ������
		 // ���������
		private ArrayList<Arrow> arr=new ArrayList<Arrow>(); //������ �� �������
		class Arrow{//���� "�������". ���� ���� �������� ���� �� � ��������
		 private int from,to; //��-��
		 private char with; //����� �� �������� ����� ���������
		 //�����������
		 public Arrow(int f,int t,char w){
		 from=f;
		 to=t;
		 with=w;
		 }
		 //������
		 public int getFrom(){
		 return from;
		 }
		 public int getTo(){
		 return to;
		 }
		 public char getWith(){
		 return with;
		 }
		@Override
		 public String toString(){
		 return from+"--"+with+"->"+to;//1--C->5
		 }
		}
		//����������� � ����� �� ����
		public Automaton(String fName) throws FileNotFoundException {
		 try{
		 File file = new File(fName);
		 Scanner inp = new Scanner(file);
		 int K,M,p;
		 posCnt=inp.nextInt();
		 K=inp.nextInt();
		 for (int i=0;i<K;i++){
		 p=inp.nextInt();
		 finPos.add(p);
		 }
		 M=inp.nextInt();
		 int f,t; char w;
		 for (int i=0;i<M;i++){
		f=inp.nextInt();
		t=inp.nextInt();
		w=inp.next().charAt(0);
		arr.add(new Arrow(f,t,w));
		 }
		 inp.close();
		 }catch(FileNotFoundException e){
		throw new FileNotFoundException();
		 }
		}
		//������
		public int getPosCnt(){
		 return posCnt;
		}
		public int getFinPosCnt(){
		 return finPos.size();
		}
		public int getArrCnt(){
		 return arr.size();
		}
		public Arrow getArrow(int n){
		 return arr.get(n);
		}
		@Override
		public String toString(){
		 String s="N="+posCnt+", K="+getFinPosCnt()+":{ ";
		 for (int i:finPos) s=s + i + " ";
		 s=s+"}, M="+getArrCnt()+": { ";
		 for (Arrow a:arr) s+=a+" ";
		 s=s + "}";
		 return s;
		}
		public boolean isFinal(int p){
		 return finPos.contains(p);
		}
		//������ ���������� ��������� �������
		private boolean trace(int p,String w){
		 if (w.isEmpty()) return isFinal(p);
		 for (int i=0;i<getArrCnt();i++)
		 if (getArrow(i).getFrom()==p && getArrow(i).getWith()==w.charAt(0))
		if (trace(getArrow(i).getTo(),w.substring(1))) return true;
		 return false;
		}
		//����� �� �������� �� ������� ������ � ������� �� ����������� ���������
		public boolean isWord(String w){
		 return trace(0,w);
		}
		//������ ���������� ���������� �������
		//����: ������ ������� len, ������ ������� � �������� p, ��������� ������ ���� w,
		// ����� �� ��� Callback, ����� ��������� ������ �� ��������� proceed
		private void make(int len,int p,String w,Callback c){
		 if (w.length()>len) return;//������ � ������� ����� � "����� � �������"
		 if (w.length()==len){//������ � ����� ����� ������� ������:
		 if (isFinal(p)) c.proceed(w);//���������, ��� p � ������ ���������
		 return;// � ������ �����
		 }
		 for (int i=0;i<getArrCnt();i++)
		 if (getArrow(i).getFrom()==p) //������ �� ���������� �������, ����� ������� ��
		 // p, ����������� �������, ����� � "�����" ���.
		 make(len,getArrow(i).getTo(),w+getArrow(i).getWith(),c);
		}
		//����� � ������ �� ����������� ���������: ����� ������� ���� � � �����
		// (������, �� ����������� �� �����!) ������� �� �� ���������
		public void makeWords(int len,Callback c){
		 make(len,0,"",c);
		}
}
