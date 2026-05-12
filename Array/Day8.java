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

    
    static void Reverse(int arr[],int n){
        int i=0;
        int j=n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
    static void PrintArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
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
        LeftShift(arr, n);
		PrintArray(arr,n);
		
	}
}
