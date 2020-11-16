package demo_OCA;

public class Test1 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.start();
    }

    void start() {
        String s1 = "one";
        String s2 = alter(s1);
        System.out.println(s1 + " " + s2);
    }

    String alter(String s1) {
        s1 = s1 + " two";
        System.out.print(s1 + " ");
        return "three";
    }
}
