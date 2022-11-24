import java.time.Year;
public class Truck extends Car{
	String year=Year.now().toString();
	int y=Integer.parseInt(year);
private double tonnage;
public Truck(String Brand, int Year, double Mileage,double Value,double Tonnage) {
	super(Brand,Year,Mileage,Value);
	tonnage=Tonnage;
}
	public String toString() {
		return super.toString()+", "+tonnage;
	}
	public double Price() {
		if((y-super.getYear())<=5) return super.getValue();
		if(tonnage<=5) return (super.getValue()*30)/100;
		if(tonnage<=10) return (super.getValue()*60)/100;
		return (super.getValue()*80)/100;
	}
}
