import java.util.*;
public class trappinfRainwater {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr1[]=new int[n];
    for(int i=0;i<=n-1;i++){
        System.out.println("enter the value for index :"+i);
        arr1[i]=sc.nextInt();
    }
    int leftBoun[]=new int[n];
    int rightBounf[]=new int[n];
    int water=0;
    leftBoun[0]=arr1[0];
    rightBounf[0]=arr1[n-1];
    // for leftbound array
    for(int i=1;i<=n-1;i++){
        if(arr1[i]<=leftBoun[i-1]){
            leftBoun[i]=leftBoun[i-1];
        }else{
            leftBoun[i]=arr1[i];
        }
    }
    // for rightbound array
    for(int i=1;i<=n-1;i++){
        if(arr1[n-i-1]<=rightBounf[i-1]){
            rightBounf[i]=rightBounf[i-1];
        }else{
            rightBounf[i]=arr1[i];
        }
    }
   
    for(int i=0;i<=n-1;i++){
        if(leftBoun[i]<=rightBounf[(n-1)-i]){
            water=water+(leftBoun[i]-arr1[i]);
        }else{
            water=water+(rightBounf[(n-1)-i]-arr1[i]);
        }
    }
    System.out.println(water);
   
   
   
   
   
   
   
    //  for(int i=0;i<=n-1;i++){
    //     System.out.println("enter the value for index :"+rightBounf[i]);

    //  }
}
}
