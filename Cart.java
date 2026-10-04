import java.util.Scanner;

public class  Cart{
    public static void main(String[] args){
        //Shoopping cart program

        Scanner scanner=new Scanner(System.in); //scanner object

        String item;
        double price;
        int quantity;
        char currency='$';
        double total;

        System.out.println("what item u want:");
        item=scanner.nextLine();
        System.out.println(item);

        System.out.println("Price of each?");
        price=scanner.nextDouble();
        System.out.println(price);

        System.out.println("How many?");
        quantity=scanner.nextInt();
        System.out.println(quantity);
        total=price*quantity;
        System.out.println("Total cost of " + quantity + " " + item + " is " + currency + total);

        scanner.close();
    }
}

