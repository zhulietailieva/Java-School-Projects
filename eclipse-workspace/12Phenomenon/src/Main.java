import java.util.ArrayList;
import java.util.Collections;

interface PropertySetter {
	
	public void setProperty(String name, char type, String value);
	
}

class Property {
	
	public String name, value;
	public char type;
	
	public String toString() {
		return name + "=" + value;
	}
	
}

abstract class Phenomenon implements PropertySetter, Comparable<Phenomenon> {
	
	public int ILLEGAL = 0x80000000;
	private String title;
	private ArrayList<Property> propertyBag = new ArrayList<Property>();
	
	public Phenomenon (String name) {
		title = name;
	}
	
	public int compareTo(Phenomenon p) {
		if (p.propertyBag.size() > this.propertyBag.size()) return 1;
		if (p.propertyBag.size() < this.propertyBag.size()) return -1;
		return this.title.compareTo(p.title);
	}
	
	public void setProperty(String name, char type, String value) throws IllegalArgumentException {
		/*if (type == 'I') {
			if (Integer.parseInt(value) > ILLEGAL) throw new IllegalArgumentException();
		}
		if (type == 'D') {
			if (Double.parseDouble(value) > (double)ILLEGAL) throw new IllegalArgumentException();
		}*/
		Property a = new Property();
		a.name = name;
		a.type = type;
		a.value = value;
		propertyBag.add(a);
	}
	
	public String getPropertyName(int propNo) {
		return propertyBag.get(propNo).name;
	}
	
	public char getPropertyType(int propNo) {
		return propertyBag.get(propNo).type;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getIntProperty(String name) {
		int val = 0;
		for (int i = 0; i < propertyBag.size(); i++) {
			if (propertyBag.get(i).name == name) {
				val = Integer.parseInt(propertyBag.get(i).value);
				break;
			}
		}
		return val;
	}
	
	public double getDoubleProperty(String name) {
		double val = 0;
		for (int i = 0; i < propertyBag.size(); i++) {
			if (propertyBag.get(i).name == name) {
				val = Double.parseDouble(propertyBag.get(i).value);
				break;
			}
		}
		return val;
	}
	
	public String getStringProperty(String name) {
		String val = "";
		for (int i = 0; i < propertyBag.size(); i++) {
			if (propertyBag.get(i).name == name) {
				val = propertyBag.get(i).value;
				break;
			}
		}
		return val;
	}
	
	public String toString() {
		String props = propertyBag.get(0).toString();
		for (int i = 1; i < propertyBag.size(); i++) {
			
			props += "," + propertyBag.get(i).toString();
			
		}
		props += ")";
		return title + ": (" + props;
	}
	
}

class Wind extends Phenomenon {

	public Wind(double speed) {
		super("wind");
		String speedString = Double.toString(speed);
		this.setProperty("speed", 'D', speedString);
		this.setProperty("measure", 'S', "km/h");
	}
	
}

abstract class Precipitation extends Phenomenon {

	public Precipitation(String name, double quantity, String measure) {
		super(name);
		String quantityString = Double.toString(quantity);
		this.setProperty("quantity", 'D', quantityString);
		this.setProperty("measure", 'S', measure);
	}
	
}

class Rain extends Precipitation {

	public Rain(double quantity, int duration, String measure) {
		super("rain", quantity, "litre/m^2");
		String durationString = Integer.toString(duration);
		this.setProperty("duration", 'I', durationString);
		this.setProperty("durationMeasure", 'S', measure);
	}
	
}

class Snow extends Precipitation {

	public Snow(double quantity, int duration, String measure) {
		super("snow", quantity, "cm");
		String durationString = Integer.toString(duration);
		this.setProperty("duration", 'I', durationString);
		this.setProperty("durationMeasure", 'S', measure);
	}
	
}

class Hail extends Precipitation {

	public Hail(double quantity, String size) {
		super("hail", quantity, "litre/m^2");
		this.setProperty("size", 'S', size);
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Phenomenon> ph=new ArrayList<Phenomenon>();
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

