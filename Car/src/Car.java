import java.time.Year;

public class Car {
	String years=Year.now().toString();
	int y=Integer.parseInt(years);
private String brand;
private short year;
private double mileage,value;
public Car(String Brand,int Year, double Mileage,double Value) {
	brand=Brand;
	year=(short)Year;
	mileage=Mileage;
	value=Value;
}
public String toString() {
	return ""+brand+" "+year+" "+ mileage+" "+value;
}
public double Price() {
	if((y-year)<=3) return (80*value)/100;
	if((y-year)<7) return (60*value)/100;
	 return (30*value)/100;
}
public short getYear() {
	return year;
}
public double getValue() {
	return value;
}
}
