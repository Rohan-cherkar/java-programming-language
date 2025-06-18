import java.util.*;
public class Stringpractice {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String name;
        name=sc.nextLine();



        // System.out.println(name);
        // System.out.println(name.length());
        // for(int i=0;i<=name.length()-1;i++){
        //     System.out.println(name.charAt(i));
        // }
        // float shortest =ShortestDistance(name);
        // System.out.println(shortest);

        // Palindrome(name);
        // CapFirstLett(name);
        // CompString(name);
        isWovel(name);
        
    }


    //                           | N
    //                           |
    // shortest distance  W-------------E
    //                           |
    //                           | S

    public static float ShortestDistance(String path){
        int x=0,y=0; 
        for(int i =0;i<=path.length()-1;i++){
            if((path.charAt(i)=='e')||(path.charAt(i)=='E')){
                x++;
            }else if((path.charAt(i)=='w')||(path.charAt(i)=='W')){
                x--;
            }else if((path.charAt(i)=='n')||(path.charAt(i)=='N')){
                y++;
            }else if((path.charAt(i)=='S')||(path.charAt(i)=='s')){
                y--;
            }
            
        }

        return (float)Math.sqrt((x*x)+(y*y));

    }

    public static void Palindrome(String str){
        int i=0;
        while(i<str.length()/2){
        if(str.charAt(i)==str.charAt(str.length()-1-i)){
            i++;
        }else{
            System.out.println("it is not palindrome");
            break;
        }
        }
        if(i==str.length()/2){
            System.out.println("palindrome");
        }

        
    }

    public static void CapFirstLett(String str){
       StringBuilder str1=new StringBuilder();
       char ch=Character.toUpperCase(str.charAt(0));
       str1.append(ch);
       for(int i=1;i<=str.length()-1;i++){
        if(str.charAt(i-1)==' '){
            str1.append(Character.toUpperCase(str.charAt(i)));
        }else{
            str1.append(str.charAt(i));
        }
       }
       System.out.println(str1);
    }

    public static void CompString(String str){
        StringBuilder str1=new StringBuilder();
        char ch=str.charAt(0);
        // str1.append(ch);
        System.out.print(ch);
        Integer count=1;
        for(int i=1;i<=str.length()-1;i++){
            
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
                
            }else if (count>1 && (str.charAt(i)!=str.charAt(i-1))||(i==str.length()-1)){
                str1.append(count);
                str1.append(str.charAt(i));
                
                count=1;
            }

        }
        str1.append(count);
        System.out.println(str1);
    }
    
    public static void isWovel(String str){
        int i=0;
        int count=0;
        while(i<str.length()-1){
            i++;
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'){
                count++;
            }

        }
        System.out.println(count);
    }





}   
 