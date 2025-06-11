import java.util.*;
public class function {

    public static int Prod(int num1,int num2){
        int produ=num1*num2;
        return produ;
    }
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    //NCR bianomial coefficient 
    public static int bian(int n){
        int fn=1;
        // int fr=1;
        for(int i=1;i<=n;i++){
            fn=fn*i;
        }
        return fn;
        // for(int i=1;i<=r;i++){
        //     fr=fr*i;
        // }
        // int bian=fn/(fr*(n-r));
        // return bian;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println("enter the valur of r");
        int r=sc.nextInt();
        // int res=Prod(a,b);
        // System.out.println(res);


        // System.out.println("enter the number ");
        // int nu=sc.nextInt();
        // int factorial=fact(nu);
        // System.out.println(factorial);
        int fn=bian(n);
        int fr=bian(r);
        int fnmr=bian(n-r);
        int bian=fn/(fr*(fnmr));
        System.out.println(bian);



    }    
}
