public class Q5 {
    public static void main(String[] args){

        //sheet1:

        float subtotal=scanner.nextFloat();
        double gratuity=scanner.nextDouble();

        gratuity=gratuity/100;

        gratuity=subtotal*gratuity;

        total=gratuity+subtotal;

        System.out.println("The gratuity is "+gratuity "and total is "+total);

}
}
