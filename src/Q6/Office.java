package Q6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Office {
    public static void main(String[] args) {
        ProductionWorker jake = new ProductionWorker("Jake", "441-M", new GregorianCalendar(2023, Calendar.DECEMBER, 21), 1, 4.65);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(jake.getHireDate().getTime());
        Employee productionWorker = new ProductionWorker("4234", "dfsf", new GregorianCalendar(2023, Calendar.DECEMBER, 21) ,1, 2);
    }
}
