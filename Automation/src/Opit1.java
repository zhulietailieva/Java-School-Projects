import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Opit1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
File file=new File("C:\\Users\\user\\Desktop\\f.txt");
Scanner sc=new Scanner(file);
while(sc.hasNextLine()) {
	System.out.println(sc.nextLine());
}

	}

}
