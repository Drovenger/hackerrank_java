package demo_OCA;

public class Polish {
    public static void main(String[] args) {
        int x = 4;
        StringBuilder sb = new StringBuilder("..fedcba");
        sb.delete(3, 6);
        sb.insert(3, "az");
        if (sb.length() > 6) x = sb.indexOf("b");
        sb.delete((x - 3), (x - 2));
        System.out.println(sb);
    }
}
