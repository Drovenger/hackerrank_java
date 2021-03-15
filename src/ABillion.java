import java.util.Calendar;
import java.util.Date;

public class ABillion {
    public static void main(String[] args) {
        long money = 0;
        int increment = 0;
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        do {
            money = money + increment;
            System.out.println(date + ": " + money + " VNDC, increase by: " + increment + " VNDC");
            cal.add(Calendar.DATE, 1);
            date = cal.getTime();
            increment = (int) (money * 0.00033) + 150000;
        } while (money <= 1000000000L);
    }
}
