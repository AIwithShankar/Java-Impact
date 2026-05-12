public class Palindrom {
    public static void main(String[] args){
        int n=121;
        int temp = n;
        int res=0;

        while(n!=0){
            int lastdigit = n%10;
            res = res*10 + lastdigit;
            n=n/10;
        }
        System.out.println(res);

        if(temp == res){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
