
public class CarKey extends Key {
	public CarKey() {
	}
	public CarKey(boolean isOn) {
	super(isOn);	
	}
	public CarKey(boolean isBroken,boolean isOn) {
		super(isBroken,isOn);
	}
	@Override
	public void turnOn() {
if(isBroken()) { System.out.println("CarKey is broken"); return;}
if(isOn()) {
System.out.println("CarKey is already turned on"); return;}
SetOn(true);
System.out.println("CarKey is trurned on");
	}
	@Override
	public void turnOff() {
if(isBroken()) { System.out.println("CarKey is broken"); return;}
if(!isOn()) {
System.out.println("CarKey is already turned off"); return;}
SetOn(false);
System.out.println("CarKey is turned off");
	}
	public String toString() {
		if(isBroken()) return "CarKey is broken";	
		if(!isOn()) return  "CarKey is intact and off";	
		return"CarKey is intact and on";
	}
}
