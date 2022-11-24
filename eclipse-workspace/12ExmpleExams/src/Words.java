import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;
public class Words {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		 ArrayList<String> list=new ArrayList<String>();
		 
		 while(list.size()<=100) {
		 
		String line=inp.nextLine();
		if(!list.contains(line)) {
			list.add(line);
		}
		
			if(line=="") {
			break;
		}
		 }
		ArrayList<String> singingWords=sortAscending(singingWords(list));
		ArrayList<String> otherWords=sortLenghtOrAscending(otherWords(list));
		ArrayList <String> res=new ArrayList<String>();
		for (int i = 0; i < singingWords.size(); i++) {
			res.add(singingWords.get(i));
		}
		for (int i = 0; i < otherWords.size(); i++) {
			res.add(otherWords.get(i));
		}
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
		 
	}
	public static ArrayList<String> singingWords(ArrayList<String> list){
		ArrayList<String> singingWords=new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
		if(	isSinging(list.get(i))) {
			singingWords.add(list.get(i));
		}
		}
		 
		 return singingWords;		 
	}
	public static ArrayList<String> otherWords(ArrayList<String> list){
		ArrayList<String> otherWords=new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
		if(	!isSinging(list.get(i))) {
			otherWords.add(list.get(i));
		}
		}
		 
		 return otherWords;		 
	}
public static boolean isSinging(String word) {
	int constCount=0;
	for (int i = 0; i < word.length(); i++) {
		if(isVowel(word.charAt(i)))constCount=0;
		else constCount++;
		if(constCount>=2)return false;
	}
	if(constCount>=2)return false;
	return true;
}
public static boolean isVowel(char c) {
	switch(c) {
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
		return true;
	}
	return false;
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
}
