
public class Natural extends DigRow{
public Natural(String s) {
	super(s);
}
public boolean isCorrect() {
if( !super.isCorrect() )return false;
if(super.isEmpty()) return false;
if(super.leadZeroCount()>0) return false;
return true;
}
public Natural Add(Natural n) {
int a =Integer.parseInt(getValue());
int b=Integer.parseInt(n.getValue());
String result=""+(a+b);
return new Natural(result);
}
public Natural Add1(Natural a){
	 if (!isCorrect()|| !a.isCorrect()){
		 return new Natural("");
	 }
	 String a1=getValue();
	 String a2=a.getValue();
	 String r="";
	 char ch;
	 int d,c=0;
	 for (int i=a1.length()-1,j=a2.length()-1;i>=0||j>=0;i--,j--){
		 d=c;
		 if (i>=0) d+=a1.charAt(i)-'0';
		 if (j>=0) d+=a2.charAt(j)-'0';
		 if (d>=10){
			 d-=10;
			 c=1;
		 }
		 else c=0;
		 ch=(char)('0'+d);
		 r=ch+r;
	 }
	 if (c==1) r="1"+r;
	 return new Natural(r);
}
public String toString() {
	return ""+getValue();
}
}
