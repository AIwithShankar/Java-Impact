package Array;

public class Binary {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        int target = 6;

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] > target){
                right = mid - 1;
            }

            else if(arr[mid] < target){
                left = mid + 1;
            }

            else{
                System.out.println(target + " at " + mid);
                return;
            }
        }

        System.out.println("Target not found");
    }
}