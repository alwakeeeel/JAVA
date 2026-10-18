import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){

        //sheet1:

        /*if the  
        user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
        as gratuity and $11.5 as total. */

        Scanner scanner=new Scanner(System.in);

        float subtotal=scanner.nextFloat();
        double gratuity=scanner.nextDouble();

        gratuity=gratuity/100;

        gratuity=subtotal*gratuity;

        double total=gratuity+subtotal;

        System.out.println("The gratuity is " + gratuity + " and total is " + total);

}
}
