package GenTypes;

public class Swappable<T> {
T first,second;
public Swappable(T a,T b) {
	first=a;
	second=b;
}
public void swap() {
	T t;
	t=first;
	first=second;
	second=t;
}
public T getFirst() {
	return first;
}
public T getSecond() {
	return second;
}
public String toString() {
	return "("+first+","+second+")";
}
}
