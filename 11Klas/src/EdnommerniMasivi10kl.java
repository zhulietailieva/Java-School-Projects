import java.util.Scanner;

public class EdnommerniMasivi10kl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Въведи брой елементи на масив 1");
	int x=sc.nextInt();
int [] a=new int[x];
String aS="";
String bS="";
for (int i = 0; i < a.length; i++) {
	System.out.println("Въведи цифра номер "+(i+1)+" от масив 1");
	a[i]=sc.nextInt();
	aS+=a[i];
}
System.out.println("Въведи брой елементи на масив 2");
int y=sc.nextInt();
int [] b=new int[y];
for (int i = 0; i < b.length; i++) {
	System.out.println("Въведи цифра номер "+(i+1)+" от масив 2");
	b[i]=sc.nextInt();
	bS+=b[i];
}
System.out.println(systemOut(a));
System.out.println(systemOut(b));
int aI=Integer.parseInt(aS);
int bI=Integer.parseInt(bS);
int sum=aI+bI;
int div=0;
if(aI>bI) div=aI-bI;
if(aI<bI) div=bI-aI;
if(aI==bI) div=0;
int p=aI*bI;
System.out.println(sum);
System.out.println(div);
System.out.println(p);
	}
	public static String systemOut(int[]a) {
		String res="";
		for (int i = 0; i < a.length; i++) {
		res+=a[i];	
		}
		return res;
	}
	

}
