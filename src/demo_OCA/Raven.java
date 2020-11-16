package demo_OCA;

interface MyIF {
    static String m2() {
        return "m2 ";
    }
}

public class Raven implements MyIF {
    static String m2() {
        return "m2.2 ";
    }

    public static void main(String[] args) {
        Raven n = new Raven();
        System.out.print(m2());
        System.out.print(MyIF.m2());
        System.out.println();
    }
}
