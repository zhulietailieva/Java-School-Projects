
//клас динамичен масив
public class DynArray {
	//Константа-стъпка за увеличааване
private static final int INCSIZE=16;
//свойства
private int[] data;//масив от данни
private int size,count;//Текуща големина и текущ брой елементи
public DynArray(){ //Конструктор на празен масив с място за INCSIZE елементи
 data=new int[INCSIZE];
 size=INCSIZE;
 count=0;
}
//Метод за добавяне накрая на масива
public void push_back(int v){
 if (count>=size){ //Ако няма вече място...
 size+=INCSIZE; //... увеличаваме обема с INCSIZE,...
 int[] t=new int[size];//... отделяме нова памет,...
 for (int i=0;i<count;i++) t[i]=data[i]; //...запазваме старите данни,...
 data=t; //... и обновяваме свойството data.
 }
 data[count++]=v; //Добавяме новия елемент на място count и увеличаваме count с едно.
}
public void insert(int n, int v) throws ArrayIndexOutOfBoundsException {
	if(n==count) {
		push_back(v); return;
	}
	if(n>count) throw(new ArrayIndexOutOfBoundsException());
	if(count==size) push_back(v);
	for (int i = count-1; i>n; i--) {
		data[i]=data[i-1];
		data[n]=v;		
	}
}

//Достъп до n-тия елемент
public int get(int n)throws ArrayIndexOutOfBoundsException
{//Ако n е извън [0, size), изключението си се получава от системата.
 //Но трябва да се алармира повиквачът И когато count<=n<size !
 if (n>=count) throw(new ArrayIndexOutOfBoundsException());
 return data[n];
}
//Промяна на стойността на n-тия елемет на v
//Реализация с идеологията "изключения"
public void set(int n,int v) throws ArrayIndexOutOfBoundsException
{//Ако n е извън [0, size), изключението си се получава от системата.
 //Но трябва да се алармира повиквачът И когато count<=n<size !
 if (n>=count) throw(new ArrayIndexOutOfBoundsException());
 data[n]=v;
}
public int getCount(){
 return count;
}
public int getSize(){
 return size;
}

@Override
public String toString(){
 String s="{ ";
 for (int i=0;i<count;i++) s+=data[i]+" ";
 return s + "}";
}
}
