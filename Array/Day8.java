package Array;


public class Day8
{

    static void Palindrome(int arr[],int n){
        int i=0;
        int j=n;
        
        while(i<=j){
            if(arr[i] != arr[j]){
               System.out.print("Not palindrome");
            }
            i++;
            j--;
        }
        System.out.print("Palindrome");
    }


    static void DeleteAtpos(int arr[],int n){
        int pos = 4;
        for(int i=pos;i<n;i++){
            arr[i] = arr[i+1];
        }
    }
    
    static void InsertAtSorted(int arr[],int n,int value){
        for(int i=0;i<arr.length;i++){
            if(value < arr[i]){
                for(int j=n;j>i;j--){
                    arr[j] = arr[j-1];
                }
                arr[i] = value;
                break;
            }
        }
    }

    
    static void Reverse(int arr[],int n,int left ,int right){
        
        while(left<=right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void RightShift(int arr[],int n){
        int temp = arr[n-1];
        for(int i=n;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    static void LeftShift(int arr[],int n){
        int temp = arr[0];
        for(int i=0;i<n;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }

    static void RightShiftByK(int arr[],int n,int k){
        Reverse(arr,n,0,n-1); // reverse whole arr
        Reverse(arr,n,0,k-1); //reverse first k elements
        Reverse(arr, n, k, n-1);
    }

    static void LeftShiftByK(int arr[],int n,int k){
        Reverse(arr, n, 0, k-1); // reverse firts k elements 
        Reverse(arr, n, k, n-1); // reverse remaining elements
        Reverse(arr, n, 0, n-1); // reverse whole array 
    }

    static void ReverseInBetween(int arr[],int n,int left ,int right){
        int l = left;
        int r = right;
        while(l <= r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    
    static void PrintArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

	public static void main(String[] args) {
		int arr[] = new int[6];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
        //{10,20,25,30,40,50}		
		int pos =3 ;
		int value = 25;
		int n = arr.length-1;
		
// 		for(int i=n;i>pos;i--){
// 		    arr[i] = arr[i-1];
// 		}
// 		arr[pos] = value;
		
// 		DeleteAtpos(arr,n);
        // InsertAtSorted(arr,n,value);
        // Reverse(arr,n);
        // Palindrome(arr, n);
        // RightShift(arr, n);
        // LeftShift(arr, n);
        // ReverseInBetween(arr,n,1,3);
        RightShiftByK(arr, n, 2);
        PrintArray(arr, n);
        System.out.println();
        // LeftShiftByK(arr, n, 2);
        
		// PrintArray(arr,n);
		
	}
}
