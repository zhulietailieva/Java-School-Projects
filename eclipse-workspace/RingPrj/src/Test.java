
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ring<Integer> r=new Ring<Integer>(4);

for (int i = 10; i <20;i++ )r.add(i);

System.out.println(r.toString());
if(r.findFirstVal(11)) System.out.println("Found");
else System.out.println("Not found");
System.out.println("first.Data="+r.getFirst());
r.remove();
System.out.println(r.toString());
	}

}
