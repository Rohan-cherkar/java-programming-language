package OOPs;
public class OOP {
    public static void main(String args[]){
        // Pen p=new Pen();
        // // p.setColor("red");
        // System.out.println(p.getColor());
        // p.setColor("pink");
        // System.out.println(p.getColor());

        // System.out.println(p.color);
        // p.setColor("pink");
        // System.out.println(p.color);

        // BankAcct sbi=new BankAcct();
        // // sbi.username="rohan";
        // System.out.println(sbi.username);
        // // sbi.password="fedhkhs";
        // sbi.setPass("jdcchdsa");
        // System.out.println(sbi.username);

        Student s1=new Student("rohan",24);
        // s1.name="rohan";
        // s1.age=22;
        s1.marks[0]=100;
        s1.marks[1]=70;
        // s1.marks[1]=390;
        s1.marks[2]=45;
        // Student s2=new Student("rohan");
        // System.out.println(s1.age);
        // System.out.println(s1.name);
        // // Pen p1=new Pen();
        // p1.setTip(67);
        // System.out.println(p1.getTip());
        // s1.marks[1]=70;
        // int phy=s1.marks[1];
        // System.out.println(phy);
        Student s2=new Student(s1);
        // s2.marks[0]=500;
        // int phy=s2.marks[0]=60;
        System.out.println(s2.name);
        s1.marks[1]=900;
        // System.out.println(s1.marks[1]);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        

        


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
    // Student(Student s1){
    // this.name=s1.name;
    // this.age=s1.age;
    // marks=new int[3];
    // for(int i=0;i<marks.length;i++){
    // this.marks[i]=s1.marks[i];
    // }
    
    
    // }
    Student(){
       marks=new int[3];
    }
    
}






