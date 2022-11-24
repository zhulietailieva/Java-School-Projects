import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

interface BasketballTeam {
public String getBasketballTeamName();
}

interface VolleyballTeam {
public String getVolleyballTeamName();
}
class TeamBase implements BasketballTeam,VolleyballTeam{
	protected String name;
	private int playersCount;
	private double [] heights;
	
	public TeamBase(){
		name="";
		playersCount=-1;
		heights=new double[0];
	}
	public TeamBase(String n,int cnt,double []h){
		name=n;
		playersCount=cnt;
		heights=h;
	}
	public double avHeight(){
		double average=0;
	for (int i = 0; i < heights.length; i++) {
		average+=heights[i];
	}
	return average/heights.length;
	}
	public double maxHeight(){
		double max=heights[0];
		for (int i = 0; i < heights.length; i++) {
			if(heights[i]>max) max=heights[i];
		}
		return max;
	}
	public int getPlayersCount(){
		return playersCount;
	}
public String getVolleyballTeamName(){
	return "VolleyballTeam: \""+name+"\", Players:"+playersCount+", average height: "+avHeight()+", maximal height: "+maxHeight();
}
public String getBasketballTeamName(){
	return "BasketballTeam: \""+name+"\", Players:"+playersCount+", average height: "+avHeight()+", maximal height: "+maxHeight();
}	
}
class cmp implements Comparator<TeamBase>{
	@Override
	//
	public int compare(TeamBase o1,TeamBase o2){
		if(o1.avHeight()<o2.avHeight()) return 1;
		if(o1.avHeight()>o2.avHeight()) return -1;
		return 0;
	}
}
class Team extends TeamBase{
	private char kind;
	public Team(){
		kind='0';
	}
	public Team(char k, String name, int cnt,double []h){
		super(name,cnt,h);
		kind=k;
	}
	public Team getData(String lineRead){
		String[] data=lineRead.split(",");
		char kind=lineRead.charAt(0);
		String name=data[1];
		int playersC=Integer.parseInt(data[2]);
		double []h=new double[data.length-3];
		for (int i = 3; i < h.length; i++) {
			h[i]=Double.parseDouble(data[i]);
		}
		return new Team(kind,name,playersC,h);
	}
@Override
public String toString(){
	if(kind=='V')return getVolleyballTeamName();
	return getBasketballTeamName();
}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Team> teams=new ArrayList<Team>();
File file=new File("data.txt");
try {
	Scanner inp=new Scanner(file);
	while(inp.hasNext()){
		Team a=new Team();
		a=a.getData(inp.nextLine());
		teams.add(a);
		
	}
	inp.close();
} catch (FileNotFoundException e) {
	System.out.println("File not found");
}
cmp comp=new cmp();
Collections.sort(teams,comp);
for(Team a:teams){
	System.out.println(a.toString());
}
	}

}
