package zadachi;

public class SortArray {
	public static void main(String[] args) {
		//Тестване
		 int[] a={6,3,1,5,7,4,2,10,6};
		 for (int i:a) System.out.print(i+" ");
		 System.out.println();
		 qsort(a);
		 for (int i:a) System.out.print(i+" ");
		 System.out.println();
		}
		//Публичен метод с очакван от потребителя интерфейс
		public static void qsort(int[] arr){
		 qsort(arr,0,arr.length-1);//Повикване на рекурсивния метод
		}
		//Частен метод - рекурсивен алгоритъм за "бързо сортиране"
		//(Забележете, че използваме същото име - един от плюсовете
		//на обектно-ориентираното програмиране.)
		private static void qsort(int[] arr,int left,int right) {
		 //Нагласяне на ключа
		 int key=findKey(arr,left,right,true);
		 //Ако има елементи наляво от ключа - да се подредят
		 if (key>left) qsort(arr,left,key-1);
		 //Ако има елементи надясно от ключа - да се подредят
		 if (key<right) qsort(arr,key+1,right);
		 //Готово!
		}
		//Инструмент за размяна на стойностите на два елемента от масив
		private static void swap(int[] arr,int ind1,int ind2){
		int tmp=arr[ind1];
		arr[ind1]=arr[ind2];
		 arr[ind2]=tmp;
		}
		//Метод за нагласяне на ключов елемент (всички по-малки от него
		//да са му вляво, а всички по-големи - вдясно)
		//Вход: масив, начало на разглежданата част от него,
		//край на разглежданата част от него, направление dir:
		//ако е true, десният индекс е "подвижен" (намалява към левия),
		//иначе левият е "подвижен" (расте към десния).
		//Изход: номер (индекс) на нагласения ключ.
		private static int findKey(int[] arr,int left,int right,boolean dir){
		 //Ако в обхвата има само един елемент - той си е ключовият
		 if (left==right) return left;
		 //Иначе ако елементите на място left и right са ДОБРЕ ПОДРЕДЕНИ,
		 //процесът продължава в посока, зависеща от dir.
		 if (arr[left]<=arr[right]){
		 if (dir) return findKey(arr,left,right-1,dir);
		 return findKey(arr,left+1,right,dir);
		 }
		 //Иначе елементите на място left и right си разменят стойностите...
		 swap(arr,left,right);
		 //...и процесът продължава, като вече е "подвижен" другият край.
		 if (dir) return findKey(arr,left+1,right,!dir);
		 return findKey(arr,left,right-1,!dir);
		}

}
