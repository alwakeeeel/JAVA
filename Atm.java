import java.util.Scanner;

public class Atm{
public static void main(String[] args){
    
    //Variables
    
    int balance=50000;
    int deposit;
    int withdraw;
    int exit;

System.out.println("===== ATM MENU =====");
System.out.println("1. Check Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Exit");

    Scanner scanner=new Scanner(System.in);//object of scanner.

    int choice=scanner.nextInt();//to control the switch.

    switch(choice){
        case 1:
            System.out.println("Your balance is"+ balance+"EGP");
            break;
        case 2:
            deposit=scanner.nextInt();
            int total=deposit+balance;
            balance=total;
            System.out.println("Your new balance after deposit ="+total+"EGP");
            break;
        case 3:
            withdraw=scanner.nextInt();
            int subtraction=balance-withdraw;
            balance=subtraction;
            System.out.println("Your new balance after withdraw ="+subtraction+"EGP");
            break;
        case 4:
            System.out.println("Thanks for using Boody banque");
            break;
        default:
            System.out.println("Error in input");
    }



}
}

