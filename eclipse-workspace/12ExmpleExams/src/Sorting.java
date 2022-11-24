import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		 ArrayList<String> list=new ArrayList<String>();
		 while(list.size()<=100) {
		 
		String line=inp.nextLine();
		if(line=="") {
			break;
		}
		if(!list.contains(line)) {
			list.add(line);
		}		
		 }
	//list=	sortAscending(list);
		// list=sortDescending(list);
		 list=sortLenghtOrAscending(list);
			System.out.println(list);
		}
	public static ArrayList<String> sortAscending(ArrayList<String> list){
		int size=list.size();
		for (int i = 0; i <size-1; i++) {
			for (int j = i+1; j <list.size(); j++) {
				if(list.get(i).compareTo(list.get(j))>0) {
					String temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);			
				}				
			}
		}
		return list;
	}
	
	public static ArrayList<String> sortDescending(ArrayList<String> list){
		int size=list.size();
		for (int i = 0; i <size-1; i++) {
			for (int j = i+1; j <list.size(); j++) {
				if(list.get(i).compareTo(list.get(j))<0) {
					String temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);			
				}				
			}
		}
		return list;
	}
	public static ArrayList<String> sortLenghtOrAscending(ArrayList<String> list){
		int size=list.size();
		for (int i = 0; i <size-1; i++) {
			for (int j = i+1; j <list.size(); j++) {
				if(list.get(i).length()<list.get(j).length()) {
					String temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);			
				}
				else if(list.get(i).length()==list.get(j).length()) {
					if(list.get(i).compareTo(list.get(j))>0) {
						String temp=list.get(i);
						list.set(i, list.get(j));
						list.set(j, temp);			
					}
				}
			}
		}
		return list;
	}
	}


