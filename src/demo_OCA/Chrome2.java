package demo_OCA;

class X {
    void go() {
        System.out.print("x ");
    }
}

class Y extends X {
    void go() {
        System.out.print("y ");
    }
}

class Z extends X {
    void go() {
        System.out.print("z ");
    }
}

public class Chrome2 {
    public static void main(String[] args) {
        X z = new Z();
        X y = new Y();
        Z y2 = (Z) y;
        z.go();
        y.go();
        y2.go();
    }
}
