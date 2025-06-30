public class Abstraction {
    public static void main(String args[]){
        Lion Simba=new Lion();
        Simba.eat();
        Cow gir=new Cow();
        gir.eat();

       

    }
}

abstract class Animal{
    int weight;
    abstract void eat();
    void walk(){
        System.out.println("animal walk");
    }

}

class Lion extends Animal{
    // int weight;
    String food;
    
    void eat(){
        System.out.println("lion eats meat");
    }
  
}

class Cow extends Animal{
    void eat(){
        System.out.println("cow eats grass");
    }
}

