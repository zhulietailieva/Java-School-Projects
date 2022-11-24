
public class Rect {
private Point NW;
private Point SE;
public Point getNW() {
	return NW;
}
public Point getSE() {
	return SE;
}
public void setNW(int x,int y) {
	NW=new Point(x,y);
}
public void setSE(int x,int y) {
	SE=new Point(x,y);
}
public long area() {
	long b=NW.getY()-SE.getX();
	int a=SE.getX()-NW.getX();
	return a*b;
}
public String toString() {
	String s="("+NW.getX()+","+NW.getY()+") ("+SE.getX()+","+SE.getY()+")";
	return s;
}
}
