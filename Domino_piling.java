import java.util.Scanner;

public class Domino_piling {
   public static void main(String[] var0) {

     //codeforces task1:
     
      Scanner var5 = new Scanner(System.in);
      System.out.println("Welcome to Domino_piling");
      System.out.println("Enter ROWS ");
      int var1 = var5.nextInt();
      System.out.println("Enter Columns ");
      int var2 = var5.nextInt();
      int var3 = var1 * var2;
      int var4 = var3 / 2;
      System.out.println("DominoCount=" + var4);
   }
}
