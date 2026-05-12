public class Armstrong {
    public static void main(String[] args){
        int n=153;
        int count=0;
        int result=0;

        int temp=n;
        while(temp!=0){
            temp=temp/10;
            count++;
        }

        temp = n;
        while(temp!=0){
            int powerresult=1;
            int lastdigit = temp%10;
            for(int i=0;i<count;i++){
                powerresult *= lastdigit;
            }
            result += powerresult;
            temp = temp/10;
        }
        if(n==result){
            System.out.println("Armstrong");

        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
