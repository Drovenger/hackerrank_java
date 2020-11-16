package demo_OCA;

public class Tipsy {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("sb1");
        StringBuilder sb2 = sb1.append("x");
        if (sb1.equals(sb2)) System.out.print("e1 ");
        StringBuilder sb3 = sb1.append("y");
        if (sb3.equals(sb2)) System.out.print("e2 ");
    }
}
