package Q6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Office {
    public static void main(String[] args) {
        ProductionWorker jake = new ProductionWorker("Jake", "441-M", new GregorianCalendar(2023, Calendar.DECEMBER, 21), 1, 4.65);
        System.out.println("Jame was hired on " +  jake.getHireDate().getTime());
        System.out.println("Jake is on "  + jake.getShiftString() + " shift");

        ProductionWorker gary = new ProductionWorker("Gary", "221-G", new GregorianCalendar(), 1, 23.10);
        System.out.println("Gary was hired on " +  gary.getHireDate().getTime());//Will be current date


        //This will error because of the invalid employee number
//        ProductionWorker productionWorker = new ProductionWorker("John", "dfsf", new GregorianCalendar(2023, Calendar.DECEMBER, 21) ,1, 2);

    }
}
