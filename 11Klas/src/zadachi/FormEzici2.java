package zadachi;

public class FormEzici2 {

	public static void main(String[] args) {
System.out.println(isWord1("0101"));
System.out.println(isWord2("ABABC"));

	}
	//<word1>::=01|10|1<word>1|<word1>01
public static boolean isWord1(String w) {
	int len=w.length();
	switch(len) {
	case 0: return false;
	case 1: return false;
	case 2: return w.equals("10")||w.equals("01");
	case 3:return false;
	case 4: return w.equals("1011")||
			 w.equals("1101")||
			 w.equals("0101")||
			 w.equals("1001");
			
	}
	if(w.charAt(0)=='1'&&w.charAt(len-1)=='1'&&isWord1(w.substring(1, len-1))) return true;
	if(w.charAt(len-1)=='1'&&w.charAt(len-2)=='0'&&isWord1(w.substring(0, len-1))) return true;
	return false;
}
//<word2>::=AB|ABA|<word2>C|<word2>B<word2>A
public static boolean isWord2(String w) {
	int len=w.length();
	switch(len) {
	case 0: return false;
	case 1: return false;
	case 2: return w.equals("AB");
	case 3: return w.equals("ABA")||
			w.equals("ABC");
	case 4: return w.equals("ABAC")||
			w.equals("ABCC");	
	}
	if(w.charAt(len-1)=='C'&&isWord2(w.substring(0, len-1))) return true;
	if(w.charAt(len-1)=='A') {
		for(int i=1;i<len-2;i++) {
			if(w.charAt(i)=='B') {
				if(isWord2(w.substring(0, i))&&isWord2(w.substring(i+1, len-2))) return true;
			}
		}
		return false;
	}
	return false;
}
}
