package zadachi;

public class Hanoi {
static int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hanoi(3,'A','C','B');
System.out.println("you have to make "+ cnt +" moves");
	}
public static void Hanoi(int n, char from,char to,char using)//Въвеждаме колона от която ще местим, колона, в която ще местим и помощна колона
{
	if(n==1) { System.out.println("move a disc from "+ from+" to "+to);cnt+=1;return;}//ако задачата има само един диск, направо го местим, "return" - спирачки
Hanoi(n-1,from,using,to);//преместваме дисковете без първия от първата в помощната колона
System.out.println("move a disc from "+from+" to "+to);
Hanoi(n-1,using,to,from);//преместваме дисковете от помощната в крайата колона
cnt++;
}
}
