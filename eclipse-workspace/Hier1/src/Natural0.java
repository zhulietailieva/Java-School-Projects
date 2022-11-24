
public class Natural0 extends Natural {
	public Natural0(String s) {
		super(s);
	}
	public boolean isCorrect() {
	if(super.getValue()=="0")return true;
	return super.isCorrect();
	}
	public boolean isZero() {
		if(super.getValue()=="0")return true;
		return false;
	}
	public String Add(Natural n) {
		int a=Integer.parseInt(getValue());
		int b=Integer.parseInt(n.getValue());
		String result=""+(a+b);
		return result;
	}
	public String toString() {
		return ""+getValue();
	}
}
