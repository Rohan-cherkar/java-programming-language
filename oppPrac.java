import java.util.*;

public class oppPrac{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first complex number");
        int r1=sc.nextInt();
        int i1=sc.nextInt();
        System.out.println("enter the second complex number");
        int r2=sc.nextInt();
        int i2=sc.nextInt();

        Complex c1=new Complex(r1, i1);
        Complex c2=new Complex(r2, i2);
        c1.add(c2).display();;
    }
}
// addition and subtraction of complex number 
class Complex{
    int real;
    int img;

    Complex(int real,int img){
        this.real=real;
        this.img=img;
    }
Complex add(Complex other){
    return new Complex(this.real+other.real ,this.img+other.img);
}

Complex sub(Complex other){
    return new Complex(this.real-other.real, this.img-other.img);
}

void display(){
    if(img>=0){
        System.out.println(real+"+"+ img+"i");
    }else{
        System.out.println(real+"-"+ (-img)+"i");
    }
}

}

