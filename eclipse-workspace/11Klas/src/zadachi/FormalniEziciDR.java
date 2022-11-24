package zadachi;

public class FormalniEziciDR {

	public static void main(String[] args) {
		String a="0", b="11", c="11110", d="1011110001",e="10001";
		System.out.println(isWord1(a));
		System.out.println(isWord1(b));
		System.out.println(isWord1(c));
		System.out.println(isWord1(d));
System.out.println(isWord1(e));
		
	}
//<word>::=0|11|<word1>0|10<word>01
	public static boolean isWord1(String s) {
		int len=s.length();
		switch(len) {
		case 0: return false;
		case 1:return s.equals("0");
		case 2: return s.equals("11");
		}
		if(s.charAt(len-1)=='0')
		return s.charAt(len-1)=='0' && isWord1(s.substring(1, len-2));
		if(s.charAt(len-1)=='1')
	 return s.charAt(0)=='1'&& s.charAt(1)=='0'&&s.charAt(len-1)=='1'
			&&s.charAt(len-2)=='0'&&isWord1(s.substring(2, len-3));
		return false;

}
	//<word>::=C|AB|BA|A<word>|B<word>C
	public static boolean isWord2(String s) {
		int len=s.length();
	switch(len) {
	case 0: return false;
	case 1: return s.equals("C");
	case 2: return s.equals("AB")||s.equals("BA");
	}
	if(s.charAt(0)=='A'&&isWord2(s.substring(1, len-1))) return true;
	if(s.charAt(0)=='B'&&s.charAt(len-1)=='C'&&isWord2(s.substring(1, len-2))) return true;
	return false;
	
		
	}
}
