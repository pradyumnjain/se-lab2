package sorting;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,4,6,1,99,3,5};
		int n = arr.length;
		insertion_sort(arr,n);
		print_arr(arr,n);
		

	}

	private static void print_arr(int[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void insertion_sort(int[] arr, int n) {
		// TODO Auto-generated method stub
		int j,key;
		for(int i=1;i<n;i++) {
			key = arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
		
		
	}

}
