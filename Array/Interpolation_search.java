package Array;

public class Interpolation_search {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int key = 3;
        int l=0;
        int r=arr.length-1;
        for(int i=0;i<arr.length-1;i++){
            int est = l+((l-r) / (arr[l]-arr[r])) * (key-arr[l]);

            if(arr[est] == key){
                System.out.print(key +" at "+ est);
                return;
            }
            else if(arr[est]>key){
                r = est - 1;
            }
            else if(arr[est]<key){
                l = est + 1;
            }
            else{
                System.out.print("Index not found");
            }
        }
    }
}
