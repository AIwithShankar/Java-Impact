package Array;

public class op_array {

    static void DeleteFirst(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
    }

    static void DeleteLast(int arr[]){

        
    }

    static void Print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = new int[6] ;
        arr[0] = 1; //25
        arr[1] = 2; //1
        arr[2] = 3; //2
        arr[3] = 4; //3
        arr[4] = 5; //4
        arr[5] = 6; //5

        int pos = 2;
        int value = 25;
        int n =5;

        for(int i=n;i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = value;
        
        // DeleteFirst(arr);
        Print_arr(arr);
    }    
}
