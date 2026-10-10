import java.util.Random;
import java.util.Scanner;

public class RPSchamp {
    public static void main(String[] args) {
        //ROCK PAPER SCICCOR.
    System.out.println("Welcome to rock paper sciccors Game!");
    
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();

    String computermove;
    int playerscore = 0;
    int computerscore = 0;
    boolean quit = false;

    while(playerscore<3 && computerscore<3){

    System.out.print("Enter rock, paper, scissors, or quit: ");
String playermove = scanner.nextLine().toLowerCase();


    boolean validMove =
    playermove.equals("rock") ||
    playermove.equals("paper") ||
    playermove.equals("sciccors");

//for quiting 
    if(playermove.equals("quit")){
        System.out.println("Thanks for playing!");
        quit=true;
        break;
    }

    if (!validMove) {
    System.out.println("Invalid move! Try again.");
} else {

    int computer=random.nextInt(3);
    
    if(computer==0){
        computermove="rock";
    }else if (computer==1) {
        computermove="paper";
    }else{
        computermove="sciccors";
    }

    boolean condition1=playermove.equals("paper") && computermove.equals("rock");
    boolean condition2=playermove.equals("rock") && computermove.equals("sciccors");
    boolean condition3=playermove.equals("sciccors") && computermove.equals("paper");

    if (condition1 || condition2 || condition3) {
    System.out.println("Player win");
    playerscore++;
    }else if(playermove.equals(computermove)){
        System.out.println("A DRAW!");
    }else{
    System.out.println("Computer win");
    computerscore++;
    }

    System.out.println("Your choice:"+playermove);
    System.out.println("Computer choice:"+computermove);
    System.out.println("Player: " + playerscore);
    System.out.println("Computer: " + computerscore);
    }
    }//loop end

    if(!quit){
    if (playerscore>computerscore) {
        System.out.println("Player is the champion.");
    }else{
        System.out.println("Computer is the champion.");}
    }

}
}
