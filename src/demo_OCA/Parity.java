package demo_OCA;

public class Parity {
    String name;

    Parity(String n) {
        name = n;
    }

    public static void main(String[] args) {
        String s = "text";
        Parity p = new Parity("text");
        StringBuilder sb = new StringBuilder("text");
        if (s.equals(p)) System.out.println("1st ");
        if (s.equals(sb)) System.out.println("2nd ");
        if (sb.equals(p)) System.out.println("3rd ");
        if (sb.equals("text")) System.out.println("4th ");
        if (s.equals("text")) System.out.println("5th ");
    }
}
