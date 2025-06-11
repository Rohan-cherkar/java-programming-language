import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the number");
        // int A=sc.nextInt();
        // System.out.println("enter the second number");
        // int B=sc.nextInt();
        // System.out.println("enter the third number");
        // int C=sc.nextInt();
        // float avg=(float)(A+B+C)/3;
        // System.out.println("average is " + avg);
        System.out.println("enter the number of values ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the value no "+i);
            int val=sc.nextInt();
            sum=sum+val;
        }
        float avg=(float)sum/n;
        System.out.println("average is "+avg);
    }
}