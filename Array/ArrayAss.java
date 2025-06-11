package Array;
import java.util.*;
public class ArrayAss {
    public static void main(String args[]){
        int arr[]=takeInput();
        int count;
        for(int i=0;i<=arr.length-1;i++){
            count=0;
            for(int j=0;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>=2){
               System.out.println(true);
                break;
            }
            
        }
       
        // GetOutput(arr);

    }




    public static int[] takeInput(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    int arr1[]=new int[n];
    for(int i=0;i<=n-1;i++){
        System.out.println("enter the value for index :"+i);
        arr1[i]=sc.nextInt();
    }
    return arr1;
}

public static void GetOutput(int arr[]){
    for(int i=0;i<=arr.length-1;i++){
        System.out.println(arr[i]);
    }
}




}
