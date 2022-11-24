import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class M2 {
	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("C:\\Users\\user\\Desktop\\auto(1).txt");
		Scanner sc = new Scanner(f);

		Automaton a = new Automaton(sc);
		a.showAllWords(7);}
}

class Arrow {

	private int from;
	private int to;
	private char val;

	public Arrow(Scanner sc) {
		from = sc.nextInt();
		to = sc.nextInt();
		val = sc.next().charAt(0);
	}

	public int getFrom() {
		return from;}

	public int getTo() {
		return to;}

	public char getVal() {
		return val;}

	public String toString() {
		return from + " -> " + to + " " + val;
	}
}

class Automaton {

	private ArrayList<Arrow> arrows = new ArrayList<Arrow>();
	private int[] finPos;
	private int N;

	public Automaton(Scanner sc) {
		N = sc.nextInt();
		int K = sc.nextInt();
		sc.nextLine();

		finPos = new int[K];

		for (int i = 0; i < K; i++) finPos[i] = sc.nextInt();

		sc.nextLine();
		int M = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < M; i++) {
			arrows.add(new Arrow(sc));
			if(i != M-1) sc.nextLine();
		}
	}

	public void printArrows() {
		for (Arrow arrow : arrows) System.out.println(arrow);
	}

	public void printFinPos() {
		for (int fP : finPos) System.out.print(fP + " ");
	}

	public boolean isFinal(int p) {
		for (int i = 0; i < finPos.length; i++) 
			if(finPos[i] == p) return true;
		return false;
	}

	public boolean isWord(String s) {
		return isWord1(s, 0);
	}

	private boolean isWord1(String s, int p) {
		if(s.length() == 0) return isFinal(p);

		ArrayList<Integer> dir = new ArrayList<Integer>();
		for (Arrow arr : arrows) {
			if(arr.getVal() == s.charAt(0) && arr.getFrom() == p) dir.add(arr.getTo());
		}
		if(dir.size() == 0) return false;

		boolean c = false;
		for (int i = 0; i < dir.size(); i++) {
			if(isWord1(s.substring(1), dir.get(i))) c = true;
		}

		return c;
	}

	private String s = "";
	private boolean brRec = false;
	public void showAllWords(int len) {
		showAll(len, 0, len);
	}

	private void showAll(int len, int p, int lenB) {
		if(brRec == true) return;
		if(len == 0) {
			if(isFinal(p)) {System.out.println(s); s = s.substring(0, s.length()-1); return;}
			else {s = s.substring(0, s.length()-1); return;}
		}
		
		for (int i = 0; i < arrows.size(); i++) 
			if(arrows.get(i).getFrom() == p) {s += arrows.get(i).getVal();showAll(len-1, arrows.get(i).getTo(), lenB);}
		
		if(lenB == len) return;
		s = s.substring(0, s.length()-1);
	
	}
}