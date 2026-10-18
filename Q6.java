import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        
        //sheet1:

        number,n1,n2,n3,n4,sum;

        Scanner scanner=new Scanner(System.in);

        int number=scanner.nextInt();

        n1=number/1000;
        n2=number/100;
        n2=n2%10;
        n3=number/10;
        n3=n3%10;
        n4=number%10;

        sum=n1+n2+n3+n4;

        System.out.println("Sum="+sum);
        
    }
}
