package autom;

public interface Callback {
	default public void proceed(String s){
		 System.out.println(s);//По подразбиране – изход на стандартния изход,
		 // следван от нов ред
		}
}
