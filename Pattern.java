public class Pattern {
    public static void main(String[] args){
        int n=4;
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //  for(int i=0;i<=n;i++){
        //     for(int j=0;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //  for(int i=0;i<=n;i++){
        //     for(int k=0;k<i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<n-i;j++){
        //         System.out.print("*");
        //     }
            
        //     System.out.println();
        // }
        // for(int i=0;i<n;i++){
        //     for(int k=0;k<n-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<=i;j++){
                 
        //         System.out.print("*");
        //         for(int k=0;k<1;k++){
        //             System.out.print(" ");
        //         }
        //     }
            
        //     System.out.println();
        // }

        // for(int i=0;i<n;i++){
        //     for(int k=0;k<n-i-1;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");

        //     }
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int num=5;
        // for(int i=0;i<=n;i++){
            
        //     for(int j=0;j<=i;j++){
        //         System.out.print(num);
                
        //     }
        //     num--;
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==1 || i==n || j==1 || j==n){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j == n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                // System.out.print(" ");
            }
            System.out.println();
        }
    }
}
