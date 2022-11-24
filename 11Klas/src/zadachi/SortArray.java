package zadachi;

public class SortArray {
	public static void main(String[] args) {
		//��������
		 int[] a={6,3,1,5,7,4,2,10,6};
		 for (int i:a) System.out.print(i+" ");
		 System.out.println();
		 qsort(a);
		 for (int i:a) System.out.print(i+" ");
		 System.out.println();
		}
		//�������� ����� � ������� �� ����������� ���������
		public static void qsort(int[] arr){
		 qsort(arr,0,arr.length-1);//��������� �� ����������� �����
		}
		//������ ����� - ���������� ��������� �� "����� ���������"
		//(����������, �� ���������� ������ ��� - ���� �� ���������
		//�� �������-������������� ������������.)
		private static void qsort(int[] arr,int left,int right) {
		 //��������� �� �����
		 int key=findKey(arr,left,right,true);
		 //��� ��� �������� ������ �� ����� - �� �� ��������
		 if (key>left) qsort(arr,left,key-1);
		 //��� ��� �������� ������� �� ����� - �� �� ��������
		 if (key<right) qsort(arr,key+1,right);
		 //������!
		}
		//���������� �� ������� �� ����������� �� ��� �������� �� �����
		private static void swap(int[] arr,int ind1,int ind2){
		int tmp=arr[ind1];
		arr[ind1]=arr[ind2];
		 arr[ind2]=tmp;
		}
		//����� �� ��������� �� ������ ������� (������ ��-����� �� ����
		//�� �� �� �����, � ������ ��-������ - ������)
		//����: �����, ������ �� ������������� ���� �� ����,
		//���� �� ������������� ���� �� ����, ����������� dir:
		//��� � true, ������� ������ � "��������" (�������� ��� �����),
		//����� ������ � "��������" (����� ��� ������).
		//�����: ����� (������) �� ���������� ����.
		private static int findKey(int[] arr,int left,int right,boolean dir){
		 //��� � ������� ��� ���� ���� ������� - ��� �� � ���������
		 if (left==right) return left;
		 //����� ��� ���������� �� ����� left � right �� ����� ���������,
		 //�������� ���������� � ������, �������� �� dir.
		 if (arr[left]<=arr[right]){
		 if (dir) return findKey(arr,left,right-1,dir);
		 return findKey(arr,left+1,right,dir);
		 }
		 //����� ���������� �� ����� left � right �� �������� �����������...
		 swap(arr,left,right);
		 //...� �������� ����������, ���� ���� � "��������" ������� ����.
		 if (dir) return findKey(arr,left+1,right,!dir);
		 return findKey(arr,left,right-1,!dir);
		}

}
