// do a program that takes the name of the user
//scanner -> java.util.Scanner

import java.util.Scanner;//package

public class Name{//define a class called name
    public static void main(String[] args){//method decliration
      
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your name:");
        String Data=scanner.nextLine();
        System.out.println("Your name  is: "+Data);
        scanner.close();
      
      //boolean
        boolean isStudent=scanner.nextBoolean();
        System.out.println("Are you a student? " + isStudent);
      
    }
}
