import java.util.*;
public class problem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of X");
        int x= sc.nextInt();
        System.out.println("Enter the Y");
        int y=sc.nextInt();
        if(x>=1 && y>=1){
            System.out.println("first quadrent");
        }
        else if(x<0 && y>=1){
            System.out.println("second Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("third quadrant");
        }
        else{
            System.out.println("fourth quadrant");
        }1
    }
}
