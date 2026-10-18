
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        //sheet1:

        int day,dayAfter,Day;

        Scanner scanner=new Scanner(System.in);

        System.out.println(" Enter day number and days after ");

        day=scanner.nextInt();
        dayAfter=scanner.nextInt();

        Day=(day+dayAfter)%7;

        switch (Day) {
            case 0:
                System.out.println("Sunday");
                break;
            
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;
            
            case 3:
                System.out.println("Wednessday");
                break;
            
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;
            
            case 6:
                System.out.println("Saturday");
                break;

            default:
                throw new AssertionError("Error!");
        }
    }
}
