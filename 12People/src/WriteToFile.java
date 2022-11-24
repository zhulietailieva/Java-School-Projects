
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileWriter fw= null;
	        File file =null;
	        try {
	            file=new File("WriteFile.txt");
	            if(!file.exists()) {
	                file.createNewFile();
	            }
	            fw = new FileWriter(file);
	            fw.write("This is a string written to a file");
	            fw.flush();
	            fw.close();
	            System.out.println("File written Succesfully");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
