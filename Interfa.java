public class Interfa{
    public static void main(String args[]){
        Bear bha=new Bear();
        // bha.eat();
        bha.doHunt();
        bha.hunt();
    }
}

interface Carnivore {
    void eat();
    void doHunt();
}

interface Harbivore {
    void hunt();
    void eat();

    
}

class Bear implements Carnivore , Harbivore{
    public void eat(){
        System.out.println("eat both veg and nonveg");
    }
    public void hunt(){
        System.out.println("yes");
    }
    public  void doHunt(){
        System.out.println("yes");
    }
}




