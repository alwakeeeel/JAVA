import java.util.Scanner;

public class Differences{
    public static void main(String[] args) {
        
        //CODEFORCES TASK 1:

        int A,B,C,D,Differences;
        
        System.out.println("Enter four numbers:");

        Scanner scanner=new Scanner(System.in);

        A=scanner.nextInt();
        B=scanner.nextInt();
        C=scanner.nextInt();
        D=scanner.nextInt();

        Differences=(A*B)-(C*D);

        System.out.println("The Answer="+Differences);

    }
}
