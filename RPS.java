import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        //ROCK PAPER SCICCOR.
    System.out.println("Welcome to ROCK PAPER SCICCOR Game!");
    
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();

    String computermove;

    while(true){
    
    int computer=random.nextInt(3);
    
        if(computer==0){
        computermove="rock";
    }else if (computer==1) {
        computermove="paper";
    }else{
        computermove="sciccors";
    }

    System.out.print("Enter Your choice:");
    String playermove=scanner.nextLine();

    System.out.println("To quit type quit:");
    if(playermove.equals("quit")){
        System.out.println("Thanks for playing!");
        break;
    }

    System.out.println("Your choice:"+playermove);
    System.out.println("Computer choice:"+computermove);

    boolean condition1=playermove.equals("paper") && computermove.equals("rock");
    boolean condition2=playermove.equals("rock") && computermove.equals("sciccors");
    boolean condition3=playermove.equals("sciccors") && computermove.equals("paper");

    if (condition1 || condition2 || condition3) {
    System.out.println("Player win");
    }else if(playermove.equals(computermove)){
        System.out.println("A DRAW!");
    }else{
    System.out.println("Computer win");
    }
    }

}
}
