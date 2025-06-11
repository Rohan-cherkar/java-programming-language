import java.util.*;
public class binDec{
    public static int decToBin(int n){
        int bin=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            n=n/2;
            bin=bin+(rem*(int)Math.pow(10, pow));
            pow++;
        }
        System.out.println(bin);
         return 1;
        
    }

    // bin to dec
    public static int binToDec(int num){
        int dec=0;
        int pow=0;
        while(num>0){
            int last=num%10;
            dec=dec+(last*(int)Math.pow(2, pow));
            pow++;
            num=num/10;
        }
        System.out.println(dec);
        return 0;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int num=sc.nextInt();
        System.out.println("ENTER THE choiec");
        System.out.println("1.Decimal to binary\n2.Binary to Decimal");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                decToBin(num);
                break;
            case 2:{
                binToDec(num);
            }
                break;

            default:
                break;
        }
       
        
        
    }
}