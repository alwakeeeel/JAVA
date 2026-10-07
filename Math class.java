import java.util.Scanner;

public class File{
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    double a;
    double b;
    double c;
    System.out.print(   "Enter the lenthg of side a:");
    a=scanner.nextDouble();

    System.out.print(   "Enter the lenthg of side b: ");
    b=scanner.nextDouble();

    c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    System.out.println("The length of the hypotenuse is: " + c);

    System.out.println(Math.PI);
    System.out.println(Math.E);

    double result;

    result=Math.sqrt(16);
    System.out.println("Square root of 16: " + result);

    result=Math.pow(4, 2);
    System.out.println("4 raised to the power of 2: " + result);

    result=Math.ceil(3.14);
    System.out.println("Ceiling of 3.14: " + result);

    result=Math.max(10,20);
    System.out.println("Maximum of 10 and 20: " + result);

    scanner.close();
}
}
