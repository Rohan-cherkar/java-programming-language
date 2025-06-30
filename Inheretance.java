
public class Inheretance{
    public static void main(String[] args) {
        Bird owl=new Bird();
        owl.fly();
    }
}

// base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

}

// derieved class 
class Bird extends Animal{
    int fins;
    void fly(){
        System.out.println("fly");
    }
}




