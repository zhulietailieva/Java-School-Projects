
public class Test {

	
		public static void main(String[] args) {
			 DynArray d= new DynArray();
			 for (int i=1;i<=20;i++) d.push_back(i);
			 System.out.println(d.toString());
			 try{
			 d.set(3, 7);
			 System.out.println(d.toString());
			 }catch(Exception e){
			 System.out.println("Wrong index");
			 }
			 try{
			 System.out.println(d.get(18));
			 }catch(Exception e){
			 System.out.println("Wrong index");
			 }
			d.push_back(7);
			System.out.println(d.toString());
			d.reverse();
			System.err.println(d.toString());

	}

}
