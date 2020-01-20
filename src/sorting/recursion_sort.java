package sorting;

public class recursion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13, 5, 6}; 
	       
        insertionSortRecursive(arr, arr.length); 
          
        print_sort(arr,arr.length); 

	}

	private static void print_sort(int[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void insertionSortRecursive(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n<=1) {
			return;
		}
		insertionSortRecursive(arr, n-1);
		int last = arr[n-1];
		int j = n-2;
		while(j>=0 && arr[j]>last) {
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]= last;
		
		
	}

}
