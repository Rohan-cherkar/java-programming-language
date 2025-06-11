import java.util.*;
public class fact{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        // int result=1;
        // for(int i=1;i<=num;i++){
        //     result*=i;
        // }
                // System.out.println(result);

        // pattern
        
        // for(int i=1;i<=num;i++){
        //     char ch='A';
        //     for(int j=1;j<=i;j++){
                
        //         System.out.print(ch);
        //         ch+=1;

        //     }
        //     System.out.println("");
        // }
        // HolloRect(num);
        // rotatPyramid(num);
        // InvPyramid(num);
        // floTrangle(num);
        // ZeOnTriangle(num);
        // Buterfly(num);
        Rhom(num);


}

// advance patterns
public static void HolloRect(int num){


        for(int i=1;i<=num;i++){ 
            // System.out.print("*");
            for(int j=1;j<=num+1;j++){
                //
                if(i==num || i==1 ||j==num+1 ||j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }System.out.println("");
        }

}


// rotated pyramid 
public static void rotatPyramid(int num){

    for(int i=1;i<=num;i++){
        for(int j=1;j<=num-i;j++){
            System.out.print(" ");
        }
        for(int j=num-i+1;j<=num;j++){
            System.out.print("*");

        }
        System.out.println("");
    }
}

// INVERTED HALF PYURAMID   
public static void InvPyramid(int num){
    for(int i=0;i<=num;i++){
        for(int j=1;j<=num-i;j++){
            System.out.print(j);
        }
        System.out.println("");
    }
}


// floid triangle
public static void floTrangle(int num){
    int temp=1;
    for(int i=0;i<=num;i++){
        for(int j=0;j<=i;j++){
            System.out.print(temp + " ");
            temp++;
        }
        System.out.println(" ");
    }
}

// 0-1 triangle
public static void ZeOnTriangle(int num){
    for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){
            if(((i%2==0)&&(j%2==0)) ||((i%2!=0)&&(j%2!=0))){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println("");
    }
}

public static void Buterfly(int num){
    for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
            
        }
        for(int j=1;j<=(num-i)*2;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    // for(int i=0;i<=num*2-1;i++){
    //     for(int j=1;j<=num-i;j++){
    //         System.out.print("*");
    //     }
    //     for(int j=num-i+1;j<=num*2;j++){
    //         if(j<=1+i*2){
    //             System.out.print(" ");
    //         }else{
    //             System.out.print("*");
    //         }
    //     }
    //     System.out.println("");
    // }
}


// solid rhombus
public static void Rhom(int num){
    for(int i=1;i<=num;i++){
        for(int j=1;j<=num-i;j++){
            System.out.print(" ");
        }
       
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=num-i;j>=1;j--){
            System.out.print("*");
        }

         System.out.println();
    }

}
}