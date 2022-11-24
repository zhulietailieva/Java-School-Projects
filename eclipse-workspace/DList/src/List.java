public class List {
 private Node first,last;
 public List(){
  first=last=null;
 }
 public List(int v){
  first=last=new Node(v);
 }
 
 //Копи-конструктор
 public List(List L){
  
 }

 public Node getFirst(){
 return first;
 }
 public Node getLast(){
	 return last;
 }
 /*public int getFront(){
	 
 }
 public int getBack(){
	 
 }
 */
 public void push_front(int v){
  if (first==null){first=last=new Node(v);
                   return;
                  }
  Node t=new Node(v,null,first);
  first.setPrev(t);
  first=t;
 }
 public void push_back(int v){
	 
 }
 public void pop_front(){
	 
 }
 public void pop_back(){
	 
 }
 public String toString(){
  if (first==null) return "null";
  Node t=first;
  String s="|";
  do{
   s+=t.toString()+"|";
   t=t.getNext();
  }while (t!=null);
  return s;
 }
}
