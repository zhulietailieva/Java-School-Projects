
public class DigRow {
private String Value;
private boolean correct=true;
public DigRow(String s) {
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)<'0'||s.charAt(i)>'9') { correct=false;}
	}
	Value=s;
}
public DigRow() {
	Value="";
}
public String getValue() {

	return Value;
}
public boolean isCorrect() {
	return correct;
}
public boolean isEmpty() {
	if(Value.length()==0)return true;
	return false;
}
public int leadZeroCount() {
	int zeroCount=0;
	for (int i = 0; i < Value.length(); i++) {
		if(Value.charAt(i)!='0') return zeroCount;
		zeroCount++;
	}
	return zeroCount;
}
public String toString() {
	return ""+Value;
}
}
