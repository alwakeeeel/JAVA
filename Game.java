import java.util.Scanner;

public class GAME{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        String adj;
        String Noun;

        System.out.println("Enter adjective:");
        adj = scanner.nextLine();

        System.out.println("Enter Noun:");
        Noun = scanner.nextLine();

        System.out.println("Today I went to a " + adj + " zoo");
        System.out.println("In a exhibit,I saw a " + Noun + " jumping up and down in its tree");

    }
}
