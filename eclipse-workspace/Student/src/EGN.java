
public class EGN {
	 private String Value;
	 private boolean isCorr;
	 private boolean isCorrect(String s){
		 int len=s.length(),d,m,y;
		 boolean isLeap;//дали годината е високосна
		 if (len!=10) return false;
		 for (int i=0;i<len;i++)
			 if (s.charAt(i)<'0'||
				 s.charAt(i)>'9') return false;
		 y=10*(s.charAt(0)-'0')+s.charAt(1)-'0';
		 m=10*(s.charAt(2)-'0')+s.charAt(3)-'0';
		 d=10*(s.charAt(4)-'0')+s.charAt(5)-'0';
		 if (m>=40){m-=40;y+=2000;}
		 else if (m>=20){m-=20;y+=1800;}
		      else y+=1900;
		 if (m<1||m>12) return false;
		 if (d<1 || d>31) return false;
		 if (y%400==0) isLeap=true;
		 else if (y%100==0)isLeap=false;
		      else isLeap=(y%4==0);
		 if (m==2)
		 {if (d>29) return false;
		  if (!isLeap && d==29) return false;
		 }
		 else
		  if ((m==4||m==6||m==9||m==11)&&d==31) return false;
		 y=0;
		 for (int i=8;i>=0;i--){
			y=2*y+s.charAt(i)-'0'; 
		 }
		 y*=2;
		 return (y%11)%10==s.charAt(9)-'0';
	 }
	 public EGN(String s){//конструктор
		 Value=s;
		 isCorr=isCorrect(s);
	 }
	 public String getEGN(){
		 if (isCorr) return Value;
		 return "Not correct";
	 }
	public String getBirthDate(){//методът връща дата,месец и година на раждане
		int m,y;
		String s;
		if(!isCorr) return "Incorrect ";//стараем се да е 10 символа, защото потребутеля очаква ЕГН-то да е 10 смвола
		y=10*(Value.charAt(0)-'0')+(Value.charAt(1)-'0');
		m=10*(Value.charAt(2)-'0')+(Value.charAt(3)-'0');	
		if(m>=40){
			m-=40;y+=2000;}
		else if(m>=20){
			m-=20;y+=1800;}
		else y+=1900;
	s=Value.substring(4, 6)+".";//това е датата
	s=s+ (m<10?"0":" ")+m+".";
	s=s+ y;
	return s;
	}
	public char getGender(){
		if((Value.charAt(8)-'0')%2==0) return 'M';
		return 'F';
	}
	public boolean isIDcorrect() {
		if(isCorr) return true;
		return false;
	}
}
