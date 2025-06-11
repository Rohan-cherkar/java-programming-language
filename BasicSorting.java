import java.util.*;
public class BasicSorting{
    public static void main(String args[]){
      int arr1[]=takeInput();
    // int arr1[]={5,4,1,3,2};

      int n=arr1.length-1;
        // GetOutput(arr1);
       BubbleSort(arr1,n);
        GetOutput(arr1);



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
        System.out.print(arr[i]+" ");
    }
}

public static void BubbleSort(int arr1[],int n){
     for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                int temp=0;
                if(arr1[j-1]>=arr1[j]){
                    temp=arr1[j-1];
                    arr1[j-1]=arr1[j];
                    arr1[j]=temp;
                }else{
                    continue;
                }
            }
        }
        // GetOutput(arr1);
}
}