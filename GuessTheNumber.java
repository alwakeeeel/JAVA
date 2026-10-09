import java.util.Random;
import java.util.Scanner;

public class Gamerandom {
    public static void main(String[] args){
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Try guess the number Game!");

        int number=random.nextInt(11);
        int attempt=0;

        while(true){

        System.out.println("Enter your guess from 0 to 10:");
        int guess=scanner.nextInt();

        if (number==guess) {
            System.out.println("Correct guess! \n the number was "+number);
            break;
        }else{
            System.out.println("Wrong!  \t retry!");
            int attempts=attempt++;
            System.out.println("Attempts="+attempts);
        }
    }

    }
}
