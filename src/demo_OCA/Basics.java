package demo_OCA;

import java.util.ArrayList;
import java.util.List;

public class Basics {
    String name;

    Basics(String n) {
        name = n;
    }

    public static void main(String[] args) {
        List<Basics> x = new ArrayList<>();
        x.add(new Basics("lisa"));
        x.add(new Basics("john"));
        if (x.contains("john"))
            x.add(new Basics("helen"));
        System.out.println(x);
    }
}
