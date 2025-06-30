public class Recursion {
    public static void main(String args[]){
        // incOrder(10);
        // System.out.println(factorial(5));
        // System.out.println(sumNat(5));
        // System.out.println(fibonnaci(5));
        int array[]={1,2,3,4,6,6,6,7,6,8,7,9};
        // System.out.println(isSorted(array,0));
        // revNum(5);
        // System.out.println(isPrime(53,2));
        // System.out.println(key(array,2,0));
        // keyLa(array,7,0);
        System.out.println(pow(2, 10));
        System.out.println(powo(2,10));
        
    }

// power of n optimized
public static double powo(int n,int p){
    if(p==0){
        return 1;
    }
    double halfPower= powo(n, p/2);
    double fullPower=halfPower*halfPower;

    if(p%2!=0){
    fullPower=n*fullPower;
    }
    
    return fullPower;
    
}


// power of given number 
public static int pow(int n, int p){
    
    if(p==0){
        return 1;
    }
    int npnm1=pow(n, p-1);
    return n*(npnm1);
}

// to print index first occurance of the given key in array
public static int key(int arr[],int k,int i){
    if(arr[i]==k){
        return i;
    }
    if((i)==arr.length-1){
        System.out.println("there is no such key");
        return 0;
    }
    
    return key(arr,k,i+1);
}

// last occurance
public static void keyLa(int arr[],int k,int i){
    
    if((i)==arr.length){
        // System.out.println("there is no such key");
        return ;
    }
    keyLa(arr,k,i+1);
    if(arr[i]==k){
        System.out.println(i);
        return ;
       
    }
    // return;
    
    
    
    
    
    
}

// check whether number is prime 
public static boolean isPrime(int n,int i){
    if(i==n){
        return true;
    }
    if(n%i==0){
        return false;
    };
    return isPrime(n, i+1);
}

// To check the giver array is sorted or not array={1,2,3,4,5,6,7}
public static boolean isSorted(int arr[],int i){
    if(i==arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
        return false;
    }
    
    return isSorted(arr, i+1);
}

// print nth fibonnaci number
public static int fibonnaci(int n){
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    int fibnm1=fibonnaci(n-1);
    int fibnm2=fibonnaci(n-2);
        
    int fib=fibnm1+fibnm2;
    return fib;

} 

// recursive function for increasing order
public static void incOrder(int n){
    if(n==1){
        System.out.print(1);
        return;
    }   
    incOrder(n-1);
    System.out.print(n +" ");
}

// recursive function for factorial
public static int factorial(int n){
    if(n==0){
        return 1;
    }
    int fnm1=factorial(n-1);
    int fn=n*fnm1;
    return fn;
}

// sum of first n natural numbers
public static int sumNat(int n){
    if(n==1){
        return 1;
    }
    int sum=sumNat(n-1);
    sum=n+sum;
    return sum;

}


public static void revNum(int n){
    if(n==0){
        System.out.println(n);
        return;

    }
    revNum(n-1);
    System.out.println(n);
    
}

}