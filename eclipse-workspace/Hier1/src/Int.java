
public class Int extends Natural {
	private char sign;
	public Int(String s) {
		super(s);
	}
	public boolean isCorrect() {
		String n=getValue();
		if(n.charAt(0)=='-') {
			sign='-';
			for(int i=1;i<n.length();i++) {
				if(n.charAt(i)<'0'||n.charAt(i)>'9') return false;
			}}
			else if(n.charAt(0)=='+'){			
				sign='+';
				for(int i=1;i<n.length();i++) {
					if(n.charAt(i)<'0'||n.charAt(i)>'9') return false;
				}
			}
			else {
				for(int i=0;i<n.length();i++) {
					if(n.charAt(i)<'0'||n.charAt(i)>'9') return false;}
			}
		if(leadZeroCount()>0)return false;
		if(isEmpty()) return false;
		return true;
	}
	public char getSign() {
		return sign;
	}
	public String Add(Int n) {
		int a=Integer.parseInt(getValue());
		int b=Integer.parseInt(n.getValue());
		String result=""+(a+b);
		return result;
	}
	public String toString() {
		return ""+getValue();
	}
	}

