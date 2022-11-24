import java.util.Scanner;
import java.util.Comparator;

public class Planets {
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
private String name;
private int number;
private int s;
private double mass;
public Planets(String N,int Num,int S,double M) {
	name=N;
	number=Num;
	s=S;
	mass=M;
}
public String getName() {
	return name;
}
public int getNumber() {
	return number;
}
public int getS() {
	return s;
}
public double getMass() {
	return mass;
}

}
