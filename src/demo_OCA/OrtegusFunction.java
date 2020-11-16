package demo_OCA;

public class OrtegusFunction {
    public int computeDiscontinuous(int x) {
        int r = 1;
        r += x;
        if ((x > 4) && (x < 10)) {
            r += 2 * x;
        } else if (x <= 4) {
            r += 3 * x;
        } else {
            r += 4 * x;
        }
        r += 5 * x;
        return r;
    }

    public static void main(String[] args) {
        OrtegusFunction ofunc = new OrtegusFunction();
        int x = 123456;
        System.out.println("OF(" + x + ") is: " + ofunc.computeDiscontinuous(x));
    }
}
