import java.util.*;
public class bitManipulation {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // System.out.println(~4);
        
        
        // left shift <<
        // int a=5 , b=2;
        // System.out.println(a<<b);
        // formula 
        // double ans=(double)a* (Math.pow(2,b));
        // System.out.println(ans);

        // // right shift >>
        // System.out.println(a>>b);
        // // formula
        // float ans1=(float)a/(float)(Math.pow(2, b));
        // System.out.println(ans1);
        // isEven(15);
        // System.out.println(1<<2);
        // getIth( 10,3);
        // System.out.println(getIth(10, 2));
        // SetIth(10,2);
        // System.out.println(~0);
        // System.out.println(UpdateBit(10,1,0));
        // System.out.print(clearRange(10,2,3));
        clearRange(10,2,4);
        

    }

    public static void isEven(int n){
        int last=n&1;
        if(last==1){
            System.out.println("not even");
        }else{
            System.out.println("even");
        }
    }

    public static int getIth(int n, int i){
        int last=1<<i;
        if((n & last )== 0){
            return 0;
        }else return 1;
    }
    
    public static int SetIth(int n,int i){
        int btmsk=1<<i;
        int res=n|btmsk; 
        System.out.println(res);
        return res;
    }

    public static int ClearBit(int n,int i){
        int bitMask=1<<i;
        int res=n^bitMask;
        return res;
    }
    
    public static int UpdateBit(int n,int i, int newBit){
        if(newBit==0){
            return ClearBit(n, i);
        }else {
            return SetIth(n, i);
        }
    }

    public static void clearRange(int n,int str,int j){
        int a=((~0)<<j+1);
        int b=1<<str-1;
        int bitMask=a|b;
        System.out.println(n&bitMask);
    }





}
