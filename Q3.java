public class Q3{
    public static void main(String[] args){
        
        //sheet 1:

        int pop=312032486;

        int YearSeconds=365*24*60*60;

        int birth=YearSeconds/7;
        int death=YearSeconds/13;
        int immigrant=YearSeconds/45;

        int change=(birth-death+immigrant);

        int year1=pop+change;
        int year2=pop+(change*2);
        int year3=pop+(change*3);
        int year4=pop+(change*4);
        int year5=pop+(change*5);
    
    }
}
