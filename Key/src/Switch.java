
public class Switch extends Key {
	public Switch() {
	}
	public Switch(boolean isOn) {
	super(isOn);	
	}
	public Switch(boolean isBroken,boolean isOn) {
		super(isBroken,isOn);
	}
	@Override
	public void turnOn() {
		if(isBroken()) { System.out.println("Switch key is broken"); return;}
		if(isOn()) {
		System.out.println("Switch key is already turned on"); return;}
		SetOn(true);
		System.out.println("Switch key is trurned on");
	}

	@Override
	public void turnOff() {	
		if(isBroken()) { System.out.println("Switch key is broken"); return;}
		if(!isOn()) {
		System.out.println("Switch key is already turned off"); return;}
		SetOn(false);
		System.out.println("Switch key is turned off");
	}
	public String toString() {
		if(isBroken()) return "Switch key is broken";	
		if(!isOn()) return  "Switch key is intact and off";	
		return"Switch key is intact and on";
	}
}
