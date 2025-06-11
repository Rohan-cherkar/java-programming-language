import java.util.*;
public class palindrome {

    // sum of digits of integer
    public static void sumOfDig(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println(sum);
    }

    public static void Pal(int num){
        int rev=0;
        int tem=num;
        for(int i=1;tem>0;i++){
        int rem=tem%10;
        rev=rev*10+rem; 
        tem=tem/10;       
        }
        System.out.println(rev);
        if (num==rev) {
            System.out.println("the number is palindrome");
            
        }else{
            System.out.println("The number is not palindrome");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        // Pal(num);
        sumOfDig(num);
    }
}
