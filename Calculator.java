import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a:");
        int a = sc.nextInt();
        System.out.println("Enter value for b:");
        int b = sc.nextInt();
        char choice = sc.next().charAt(0);

            switch(choice){
                case '+':
                    System.out.println(a+b);
                    break;
                    
                case '-':
                    System.out.println(a-b);
                    break;

                case '*':
                    System.out.println(a*b);
                    break;

                case '/':
                    if(a==0 || b==0){
                        System.out.println("Divisible by zero error");
                    }
                    System.out.println(a/b);
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
        }
    
    }
}