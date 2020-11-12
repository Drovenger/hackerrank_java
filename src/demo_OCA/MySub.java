package demo_OCA;

class MySuper {
    public MySuper(int i) {
        System.out.print(" super " + i);
    }
}

public class MySub extends MySuper {
    public MySub() {
        super(2);
        System.out.print(" sub");
    }

    public static void main(String[] args) {
        MySuper sup = new MySub();
    }
}
