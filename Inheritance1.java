class Inheritance1 {

    public static void main(String args[]){
        Bird owl=new Bird();
        owl.fly();
        owl.color="brown";
        System.out.println(owl.color);

        Mamel ele=new Mamel();
        ele.walk();


    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
}

class Mamel extends Animal{
    int legs;
    void walk(){
        System.out.println("Mamel walk");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("birds fly");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("fish Swim");
    }
}





