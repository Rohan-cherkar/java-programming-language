package OOPs;
public class OOP {
    public static void main(String args[]){
        Animal lion=new Animal();
        lion.nam("liger");
        lion.outname();

    }
}

class Pen{
    private String color="blue";
    int tip=5;


    String getColor(){
        return this.color;
    }

    void  setColor(String color){
        this.color=color;
    }

    void setTip(int size){
        this.tip=size;
    }
    int getTip(){
        return tip; 
    }
}

class BankAcct{

    public String username="ram";
    private String password;
    public void setPass(String pass){
        password=pass;
    }
}

class Student{
    String name="ram";
    int age=30;
    int marks[];

    Student(String name ,int age ){
        this.name=name;
        marks=new int[3];
    }
    Student(Student s1){ 
        this.name=s1.name;
        this.age=s1.age;
        marks=new int[3];
        this.marks=s1.marks;

        // this.marks[1]=60;
        // this.marks[2]=90;

    }

    Student(){
       marks=new int[3];
    }
    
}

class Animal{
    private String name="mufasa";
    int age;

    String nam(String name){
        return this.name=name;
    }

    void outname(){
        System.out.println(name);
    }

    Animal(){

    }
    Animal(int age){
        
    }
    void sound(){
        System.out.println("animal make sound ");
    }
}




