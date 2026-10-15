import java.util.Scanner; //Scanner class:

public class Simplecalc{

    //comments by boody alwakeel:

    public static void main(String[] args) {

        //codeforces task 1:
        
        //Variables:

        int X , Y , temp , add , subtract , divide , op;
        long  multiply;

        System.out.println("Enter two numbers:");
        

        //scanner for input:
        Scanner scanner=new Scanner(System.in);
        X=scanner.nextInt();
        Y=scanner.nextInt();

        //operator:

        System.out.println("avaliable operators: 1. + , 2. - , 3.* , 4./");
        System.out.println("Choose a number:");

        op=scanner.nextInt();

        //cases:

        switch (op) {

            case 1 :

                add= X+Y;

                System.out.println("The summation ="+add);

                break;

                case 2 :
                    //NO NEGATIVE ANSWERS IN SUBTRACT WANTED:
                    if (X<Y) {
                        //Simple swap:
                        temp=Y;
                        Y=X;
                        X=temp;
                        subtract=X-Y;
                    }else{
                        subtract=X-Y;
                        System.out.println("The subtraction="+subtract);
                    }

                    break;

                case 3 :
                    multiply=X*Y;
                    System.out.println("The multiplication="+multiply);
                    break;

                case 4 :
                    if (Y==0) {
                        System.out.println("Invalid Denominator");
                    }else{
                        divide=X/Y;
                        System.out.println("The division = "+divide);
                    }
                    break;

            default:
                throw new AssertionError();
        }
    }
}
