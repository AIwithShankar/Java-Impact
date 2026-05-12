import java.util.Scanner;
public class String1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //string literals
        String str1;
        str1 = sc.next();
        System.out.println(str1);

        //new keyword
        String str2 = new String(str1);

        if(str1 == str2){
            System.out.println("Same");
        }
        else{
            System.out.println("not Same");
        }
    }
}
