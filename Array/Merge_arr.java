package Array;

public class Merge_arr {
    	public static void main(String[] args) {
		int arr1[] = {5,2,1};
		int arr2[] = {4,6,2};
		int n1=arr1.length;
		int n2=arr2.length;
		int n3=n1+n2;
		int arr3[] = new int[(n3)];
		
		int k=0;
		int i=0;
		int j=0;
		while(i < n1 && j < n2){
		    if(arr1[i] < arr2[j]){
		        arr3[k] = arr1[i];
		        i++;
		        k++;
		    }
		    else{
		        arr3[k] = arr2[j];
		        j++;
		        k++;
		    }
		}
		
		while(i<n1){
		    arr3[k] = arr1[i];
		    i++;
		    k++;
		}
		
		while(j<n2){
		    arr3[k] = arr2[j];
		    j++;
		    k++;
		}
		
		
		for(int r=0;r<n3;r++){
		    System.out.print(arr3[r]+" ");
		}
		
		
	}
}
