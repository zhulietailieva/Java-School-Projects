import java.util.Scanner;
public class Owner extends Rect implements NameTools{
private String name;
public Owner(Scanner a) {
	System.out.print("Name: ");
	name=a.nextLine();
	System.out.println("North-west corner ");
	System.out.println("X: ");
	int x=a.nextInt();
	System.out.println("Y: ");
	int y=a.nextInt();
	setNW(x,y);
	System.out.println("South-east corner ");
	System.out.println("X: ");
	x=a.nextInt();
	System.out.println("Y: ");
	y=a.nextInt();
	setSE(x,y);
	
	a.nextLine();
}
public String getName() {
	return name;
}
@Override
public String personalName() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String familyName() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String abbreveation(String s) {
	// TODO Auto-generated method stub
	return null;
}
}
