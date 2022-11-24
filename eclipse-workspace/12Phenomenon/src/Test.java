/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

interface PropertySetter{
	public void setProperty(String name,char type, String value);
}
class Property {
	public String name;
	public Phenomenon type;
	public String value;
	@Override
	public String toString(){
	
	}
}
abstract class Phenomenon implements PropertySetter,Comparable<Phenomenon>{
	public int ILLEGAL=0x80000000;
	private String title;
	private ArrayList<Property> PropertyBag=new ArrayList<>();
	public Phenomenon(String name) {
		
	}
	public int compareTo(Phenomenon p) {
		
	}
	public void setProperty(String name,char type, String value) {
		
	}
	public String getPropertyName(int propNo) {
		
	}
	public char getPropertyType(int propNo) {
		
	}
	public String getTitle() {
		return title;
	}
	public int getIntProperty(String name) {
		
	}
	public double getDoubleProperty(String name) {
	
	}
	public String getStringProperty(String name) {
		
	}
	@Override
	public String toString() {
		
	}
	}
	class Wind extends Phenomenon{
		public Wind(double speed) {
			super();		
		}
	}
	abstract class Precipitation extends Phenomenon{
		public Precipitation(String name,double quantity,String measure) {
			super();
		}
	}
	class Rain extends Precipitation {
		public Rain(double quantity,int duration,String measure) {
			
		}
	}
	class Snow extends Precipitation{
		public Snow(double quantity,int duration,String measure) {
			
		}
	}
	class Hail extends Precipitation{
		public Hail(double quantity, String size) {
			
		}
	}

public class Test {

	public static void main(String[] args) {
		ArrayList<Phenomenon> ph=new ArrayList<>();
		ph.add(new Wind(63));
		ph.add(new Snow(3,1,"day"));
		ph.add(new Rain(32,25,"min"));
		ph.add(new Hail(10,"egg"));
		ph.add(new Rain(15,3,"hour"));
		for (Phenomenon p:ph) System.out.println(p);
		System.out.println("--------------------------------");
		Collections.sort(ph);
		for (Phenomenon p:ph) System.out.println(p);

	}

}
*/