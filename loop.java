import java.util.*;
public class loop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("eter the number");
        int num=sc.nextInt();
        // for(int i=0;i<=num;i++){
        //     System.out.print(i+" ");
        // }

        // // while loop
        // int i=0;
        // int sum=0;
        // while(i<=num){
        //     sum=sum+i;
        //     // System.out.print(i+ " ");
        //     i++;
        // }
        // System.out.println(sum);

        // patterns using for loop
        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=num;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");

        // Reverse of number
        // int rev;
        // for(int i=num;num>1;i--){
        //     rev=num%10;
        //     System.out.print(rev);
        //     num=num/10;
        // }
        while(true){
            System.out.println("enter the number");
            int num1=sc.nextInt();
            
            if(num1%10==0){
                continue;
            }
            System.out.println(num1);
            
        }
        
        }

    }
    

