public class EmhancedSwitch {
    public static void main(String[] args) {
        
        String Student ="boody";

        //The enhanced switch:
        switch (day) {
            case "boody" , "jena" -> System.out.println("Is a student."); 
            case "joe" , "ossy" ->  System.out.println("Is not a student.");
        }

        //Normal switch:

        int dayI=1;

        switch(dayI){
            
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            }
    }
}
