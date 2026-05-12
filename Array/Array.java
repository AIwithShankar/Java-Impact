package Array;

public class Array {

    static void InsertAtFirst(int arr[],int val){
        int a;
        int b = 0;
        for(int i=0;i<arr.length;i++){
            a = arr[i];
            arr[++b] = a;
        }
        arr[0]=val;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        InsertAtFirst(arr,6);
    }
}
