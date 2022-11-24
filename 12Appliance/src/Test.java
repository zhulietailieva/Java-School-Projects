import java.util.Scanner;
abstract class Appliance {
private String name;
private double weight;
private double breadth;
private double width;
private double height;
public Appliance(String Name,double Weight,double Breadth,double Width,double Height){
	name=Name;
	weight=Weight;
	breadth=Breadth;
	width=Width;
	height=Height;
}
public String getName(){
	return name;
}
public double getWeight(){
	return weight;
}
public double getBreadth(){
	return breadth;
}
public double getWidth(){
	return width;
}
public double getHeight(){
	return height;
}
public String getVolume(){
	double v= breadth*width*height;
	return String.format("%.2f", v);
}
public abstract String action();
@Override
public String toString(){
	return name+": weighs "+String.format("%.2f",getWeight())+", has volume of "+getVolume()+" m^3, "+action();
}

}



 class Fridge extends Appliance{
	
public Fridge(double wei,double bre, double wid,double hei){
	super("Fridge",wei,bre,wid,hei);
}
public Fridge(String name,double wei,double bre, double wid,double hei){
	super(name,wei,bre,wid,hei);
}
public String action(){
	return "and keeps food cool.";
}
}



 class WashingMachine extends Appliance{
public WashingMachine(double wei,double bre, double wid,double hei){
	super("Washing Machine",wei,bre,wid,hei);
}
public String action(){
	return "and washes clothes.";
}
}



 class Dishwasher extends Appliance {
public Dishwasher(double wei,double bre, double wid,double hei){
	super("Dishwasher",wei,bre,wid,hei);
}
public String action(){
	return "and washes dishes.";
}
}




 class Kitchen {
private Appliance []app;

public Kitchen(){
	Scanner inp=new Scanner(System.in);
	System.out.print("How many appliances: ");
	int count=inp.nextInt();
	app=new Appliance[count];
	for (int i = 0; i < count; i++) {
		System.out.println("Appliance #"+(i+1));
		System.out.print("Appliance type (1: dishwasher,2: refrigerator,3:washing machine): ");
		int appType=inp.nextInt();
		
		System.out.print("- weight: ");
		double wei=inp.nextDouble();
		System.out.print("- breadth: ");
		double bre=inp.nextDouble();
		System.out.print("- width: ");
		double wid=inp.nextDouble();
		System.out.print("- height: ");
		double hei=inp.nextDouble();
		
		switch(appType){
		case 1:
			app[i]=new Dishwasher(wei,bre,wid,hei); break;
		case 2:
			app[i]=new Fridge("Refrigerator",wei,bre,wid,hei); break;
		case 3:
			app[i]=new WashingMachine(wei,bre,wid,hei); break;
		}
	}
	inp.close();
	}
	@Override
	public String toString(){
		String res= "";
		for (int i = 0; i < app.length; i++) {
			res+=app[i].toString()+"\n";
		}
		return res;	
}
	
}



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kitchen k=new Kitchen();
		System.out.println(k);
	}

}
