import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class Main {
	// System.out.println("INSERT INTO People VALUES (0,"+isWoman+",'"+data[1]+"',\""+dateTxt+"\"");
	//INSERT INTO People VALUES (0,1,'Katy Smith',"2007-3-20"); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileWriter fw= null;
	        File file1 =null;
		try {
			
			
	file1=new File("WriteFile.txt");		
	if(!file1.exists()) {
        file1.createNewFile();
    }
	 fw = new FileWriter(file1);
		File file=new File("People.txt");
		Scanner inp=new Scanner(file);
		inp.nextLine();
		String content="";
		while(inp.hasNext()) {
			String [] data=inp.nextLine().split("\t");
	
		//	System.out.println(data[0]+" "+data[1]+" "+data[2]);
			int isWoman=-1;
			
			if(data[0].equals("TRUE")){
				isWoman=1;
			}
			else if(data[0].equals("FALSE")) {
				isWoman=0;
			}
			String dateT="";
			
			if(data[2].length()==8) {
				dateT=data[2].charAt(4)+""+data[2].charAt(5)+""+data[2].charAt(6)+""+data[2].charAt(7)+"-"+data[2].charAt(2)+"-"+data[2].charAt(0);
			}
			else if(data[2].length()==9) {
					if(data[2].charAt(1)=='.') {
						dateT=data[2].charAt(5)+""+data[2].charAt(6)+""+data[2].charAt(7)+""+data[2].charAt(8)+"-"+
								data[2].charAt(2)+""+data[2].charAt(3)+"-"+data[2].charAt(0);
					}
					else {
						dateT=data[2].charAt(5)+""+data[2].charAt(6)+""+data[2].charAt(7)+""+data[2].charAt(8)+"-"+
								data[2].charAt(3)+"-"+data[2].charAt(0)+""+data[2].charAt(1);
					}
			}
			else {
				dateT=data[2].charAt(6)+""+data[2].charAt(7)+""+data[2].charAt(8)+""+data[2].charAt(9)+"-"+data[2].charAt(3)+""+data[2].charAt(4)+"-"
			+data[2].charAt(0)+""+	data[2].charAt(1);
			}
		 content+="INSERT INTO People VALUES (0,"+isWoman+",'"+data[1]+"',\""+dateT+"\""+");"+"\n";
		
			System.out.println("INSERT INTO People VALUES (0,"+isWoman+",'"+data[1]+"',\""+dateT+"\""+");");
			fw.write("INSERT INTO People VALUES (0,"+isWoman+",'"+data[1]+"',\""+dateT+"\""+");");
			fw.write("\n");
		}
		fw.flush();
        fw.close();
		inp.close();
	
		}catch(Exception e) {
			System.out.println("File not found.");
		}
		
	}

}
