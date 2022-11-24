
abstract public class Key {
private boolean broken,on;
private boolean restart=true;
public Key() {
	broken=false;
	on=false;
}
public Key(boolean isOn) {
	broken=false;
	on=isOn;
}
public Key(boolean isBroken,boolean isOn) {
	broken=isBroken;
	on=isOn;
}
abstract public void turnOn();
abstract public void turnOff();
public void Restart() {
	if(broken) { restart=false;return;}
	if(!on) {restart=false;return;}
	on=false;
	on=true;	
}
public void checkRestart() {
	if(restart) System.out.println("Restarted"); 
	if(!restart)System.out.println("Restart impossible");
}
public String toString() {
	if(broken)  return("Key is broken");
	if(on) return "Key is intact and on";
	return "Key is intact and off";	
}
public boolean isBroken() {
	return broken;
}
public boolean isOn() {
	return on;
}
public void SetOn(boolean tf) {
	on=tf;
}
}
