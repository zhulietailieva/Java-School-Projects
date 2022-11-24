
public class Test {
 public static void main(String[] args) {
  List n=new List(444);
 n.push_front(5);
 n.push_front(7);
 n.push_front(9);
 

  
  
  System.out.println(n.toString());
  System.out.println(n.getFirst());
  System.out.println(n.getLast());
 }
}
