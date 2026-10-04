// do a program that takes the name of the user
//scanner -> java.util.Scanner

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String Data = scanner.nextLine();

        System.out.println("Your name is: " + Data);

        // boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Are you a student? " + isStudent);

        scanner.close();
    }
}
