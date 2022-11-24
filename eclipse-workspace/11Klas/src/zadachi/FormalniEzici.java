package zadachi;

public class FormalniEzici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="(((()()))())(((()()))())";
		String word1="11110000";
		System.out.println(isWord1(word1));
		//.out.println(isPara(s));
		//System.out.println(isPara1(s));
		
	}
	//<word1>::= 0|10|1<word1>0
	public static boolean isWord1(String s) {
		int len=s.length();
	switch(len) {
	case 0: return false;
	case 1:return  s.equals("0");
	case 2: return s.equals("10");
	}
	return s.charAt(0)=='1'&&s.charAt(len-1)=='0'&& isWord1(s.substring(1, len-1));
	
	}
	public static boolean isPara(String s){
		//System.out.print("inPara: "+s);
		int len=s.length();//дължина на думата
		if (len==0||(len & 1)==1) return false;//(len & 1)==1 е нечетно, а скобите винаги са по две
		if (s.charAt(0)!='(' || s.charAt(len-1)!=')') return false;
		if (len==2) return true;
		if (isPara(s.substring(1,len-1))) return true;//функцията substring в случая обхожда дължината от 2рия до предпоследния символ
		return isPara(s,2);//това е private методът isPara
		}
		private static boolean isPara(String s,int partLen){
		int strLen=s.length();
		//System.out.println("split: s="+s+", partLen="+partLen+"+ strLen="+strLen);//проверка
		if (partLen==strLen) return false;
		if (isPara(s.substring(0,partLen)) &&
		isPara(s.substring(partLen,strLen))) return true;
		return isPara(s,partLen+2);
		}		
	//проверява isPara с два метода и рекурсия, без да се въвежда цикъл
		
public static boolean isPara1(String s) {
	int len=s.length();
	if(len==0) return false;
	if(len%2!=0) return false;//защотот скобите винаги са по две и няма как думата да е с нечетен брой символи
	if(s.charAt(0)!='('||s.charAt(len-1)!=')')return false;// думата задължително трябва да започва с "(" и да завършва с ")", за да е правилно условието
	if(len==2) return s.equals("()");//ако думата има само 2 симвоа, те задължително трябва да са тези
	if(isPara(s.substring(1, len-1))) return true;
	//с този цикъл ще разделим думата на 2 части и ще проверим за всяка от тях дали isPara
	for (int i = 2;//дължината на парчето, което късаме от низа
			i <len; i+=1) {
		if(isPara(s.substring(i, len))// първата част
				&&
				isPara(s.substring(0, i)))//проверяваме втората част
			return true;//ако двете части на низа/думата отговарят на условието, значи целия низ отговаря
				
	}
	return false;
}
		
}
