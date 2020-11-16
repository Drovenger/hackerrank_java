package demo_OCA;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFlies {
    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime t1 = null;
        try {
            t1 = LocalTime.parse("13:57:03", f1);
        } catch (Exception e) {
            System.out.println("yikes");
        }
        System.out.print(t1 + " ");
        assert t1 != null;
        System.out.print(t1.plusHours(1) + " ");
        System.out.print(t1.plusHours(4));
    }
}
