import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        //Random number generator
        Random random=new Random();

        int number;

        number=random.nextInt(1,6); 

        System.out.println(number);
    }
}
