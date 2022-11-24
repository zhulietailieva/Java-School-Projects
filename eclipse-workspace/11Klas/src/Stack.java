
public class Stack extends DynArray {
public void push(int x) {
	push_back(x);
}
public void pop() {
	remove(getCount()-1);
}
public int top() {
	return get(getCount()-1);
}
}

