package Array;
import java.util.*;

public class ArrayMain{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    int arr1[]=new int[n];
    for(int i=0;i<=n-1;i++){
        System.out.println("enter the value for index :"+i);
        arr1[i]=sc.nextInt();
    }
    // int arr[]={2,4,6,8,10,12};
    // System.out.println("enter the value you want to find");
    // int key=sc.nextInt();
    // binSr(arr, key);
    // LargArr(arr);
    // BinSrc(arr1,key);
    // Rev(arr);
    // for(int i=0;i<=arr.length-1;i++){
    //     System.out.print(arr[i]+" ");
    // }

    // Pair(arr);
    // subArr(arr1);
    Kadans(arr1);
    

}
// fiunction to take input
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
// function to give output
public static void GetOutput(int arr[]){
    for(int i=0;i<=arr.length-1;i++){
        System.out.println(arr[i]);
    }
}


public static void binSr(int arr[],int key){
    for(int i=0;i<=arr.length-1;i++){
    
        if(arr[i]==key){
            System.out.println("the "+key+" is at position= "+(int)(i+1));
        }
    } 
    
}

// largest in array
public static int LargArr(int arr[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<=arr.length-1;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
     
    }
    return largest;  
}

// binary search
public static int BinSrc(int arr[], int key){
    int low=0;
    int hig=arr.length-1;
    

    for(int i=0;i<=arr.length;i++){
        int mid=(low+hig)/2;
        if(arr[mid]==key){
           System.out.println(mid);
           return mid;
        }else if(arr[mid]<key){
            low=mid+1;
        }else{
            hig=mid-1;
        }
    }
    return -1;
    
}

// reverse an array
public static int[] Rev(int arr[]){
    int temp;
    int n=arr.length-1;
    for(int i=0;i<=n/2;i++){
        temp=arr[i];
        arr[i]=arr[n-i];
        arr[n-i]=temp;

    }

    return arr;

}

// pairs in array
public static void Pair(int arr[]){
    int n=arr.length-1;
    for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
            if(i>=j){
                continue;
            }else{
            System.out.print("("+arr[i]+","+arr[j]+")  ");
            }
        }
        System.out.println();
    }
}

// subarray from array
public static void subArr(int arr[]){
    
    int n=arr.length-1;
    int totNoSubArr=arr.length*(arr.length+1)/2;
    
    int res[]=new int[totNoSubArr];
    int total=0;
    
    for(int i=0;i<=n;i++){
        int totSum=0;
        int sum=0;
        for(int j=i;j<=n;j++){
            sum=0;
            for(int k=i;k<=j;k++){
                System.out.print(arr[k] +" ");
                sum=sum+arr[k];
            }
            System.out.println("sum= "+sum);
            res[total]=sum;
            total++;
            System.out.println();
            totSum=totSum+sum;
            
        }
        
        System.out.println();
        // System.out.print(sum);
        System.out.println();
        
        System.out.println(totSum);
    }
    int largest=Integer.MIN_VALUE;
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<=res.length-1;i++){
        System.out.print(res[i]+" ");
        if(res[i]>largest){
            largest=res[i];
        }
        if(res[i]<smallest){
            smallest=res[i];
        }

        }
    
    System.out.println();
    System.out.println("Total no of subarrays: " +total);
    System.out.println("The largest value is : "+largest);
    System.out.println("The smallest value is : "+smallest);

}

// Subarray prefix
public static void PreArr(int arr[]){
    int prefix[]=new int[arr.length];
    prefix[0]=arr[0];
for(int i=1;i<=arr.length-1;i++){
    prefix[i]=prefix[i-1]+arr[i];
}
    
}

// kadans algorithm
public static void Kadans(int arr[]){
    int cs=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<=arr.length-1;i++){
        cs=cs+arr[i];
        if(cs<0){
            cs=0;
        }else if(cs>maxSum){
            maxSum=cs;
        }

    }
    if(maxSum<0){
        System.out.println();
    }
    System.out.println("The maximum sum is "+maxSum);
}


}