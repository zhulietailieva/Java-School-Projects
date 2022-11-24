public class Node {
 private int data;
 private Node prev,next;
 public Node(int v){
  data=v;
  prev=next=null;
 }
 public Node(int v,Node p,Node n){
  data=v;
  prev=p;
  next=n;
 }
 public int getData(){
  return data;
 }
 public void setData(int v){
  data=v;
 }
 public Node getPrev(){
  return prev;
 }
 public Node getNext(){
  return next;
 }
 public void setPrev(Node p){
  prev=p;
 }
 public void setNext(Node n){
  next=n;
 }
 public String toString(){
  String s="";
  if (prev==null) s="null";
  else s=""+prev.data;
  s+="<-"+data+"->";
  if (next==null) s+="null";
  else s+=next.data;
  return s;
 }
}

