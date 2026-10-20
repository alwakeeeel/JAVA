public class Milestokillos{
    public static void main(String[] args){

        //Sheet2:

        double miles=1;
        double killos;

        for (int i=0 ; i<10 ; i++) {
            killos=miles*1.609;
            System.out.println("milles: "+miles+" killos= " + killos);
            miles=miles+1;
        }
    }
}
