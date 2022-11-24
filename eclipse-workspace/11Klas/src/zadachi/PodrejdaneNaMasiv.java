package zadachi;



public class PodrejdaneNaMasiv {

	public static void main(String[] args) {
		int[]arr= {5,5,6,1,1,0};
		podrejdane(arr);
	}
	public static void podrejdane(int []arr) {
		int min,swap;
		int k;
		
		
		for (int i = 0; i <= arr.length-1; i++) {	
		k=i;
		min=arr[i];
		for(int j=i+1;j<=arr.length-1;j++)
			if(arr[j]<min){
				min=arr[j];
				k=j;
				}
				swap=arr[k];
				arr[k]=arr[i];
				arr[i]=swap;
			
			
		
		}
		for(int i=0;i<=arr.length-1;i++)
			System.out.print(arr[i]+" ");
	}
	
			
			
	}

