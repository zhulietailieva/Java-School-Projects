package zadachi;

public class PtoQcls {
	public static void main(String[] args) {
	byte p=16,q=16;
	System.out.println(PtoQ("FABC2",p,q));
	}
	

	 public static String PtoQ(String number,byte p,byte q){
	 return DecToQ(PtoDec(number,p),q);
	 }
	 private static long PtoDec(String number,byte p){
	 int len=number.length();
	 if (len==1) return val(number.charAt(0));
	 return (long)p*PtoDec(number.substring(0,len-1),p)+val(number.charAt(len-1));
	 }
	 private static String DecToQ(long number,byte q){
	 if (number<q) return ""+digit((byte)number);
	 return DecToQ(number/q,q)+digit((byte)(number%q));
	 }
	 private static char digit(byte d){
	 if (d<=9) return (char)('0'+d);
	 return (char) ('A'-10+d);
	 }
	 private static byte val(char c){
	 if (c<='9') return (byte) (c-'0');
	 return (byte) (c-'A'+10);
	 }
}
