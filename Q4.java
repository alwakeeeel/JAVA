import  java.util.Scanner;

public class Q4{
    public static void main(String[] args){

        //sheet1:

        Scanner scanner=new Scanner(System.in);

        double Vol , Area;

        System.out.print("Enter raduis and lenght:");

        double r=scanner.nextDouble();
        double l=scanner.nextDouble();

        Area=r * r * Math.PI;
        Vol=Area*l;

        System.out.println("\n Area="+Area);
        System.out.println("Volume="+Vol);

    }
}
