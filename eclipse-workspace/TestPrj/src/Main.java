import autom.*;//Включване на библиотеката с всички създадени в нея класове
//Клас за предефиниране на обработващата функция proceed
// (в случая – искаме изходът да бъде предхождан от брояч)
class Callback1 implements Callback{
static int n=0;
@Override
public void proceed(String s) {
 System.out.print(++n+": ");
 Callback.super.proceed(s);
}
}

public class Main {

	public static void main(String[] args) {
		 try{
		 Automaton a=new Automaton("Zad2Juja.txt");
		 //Направи всички седембуквени думи, описани чрез автомата, като всяка дума бъде
		 // обработена по желания от мен начин (а именно – извеждана на стандартния изход и
		 // предхождана от номер)
		 a.makeWords(5, new Callback1());
		 }catch (Exception e){
		 System.out.println("File not found");
		 }
		}

}
