import java.util.*;
public class sortPr {
    public static void main(String args[]){
        int arr[]=takeInput();
        int n=arr.length-1;
        BubbleSrt(arr,n);
        GetOutput(arr);



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
        System.out.print(arr[i]+"   ");
    }
}

// bubble sort
public static void BubbleSrt(int arr[],int n){
    for(int i=0;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        int temp=0;
        if(arr[j-1]>arr[j]){
            temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
        }else{
            continue;
        }
    }
}


}
}
