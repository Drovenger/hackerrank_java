package demo_OCA;

public class Xmen extends Heroes {
    public static void main(String[] args) {
        new Xmen();
        System.out.println(s);
    }
}

class Heroes {
    static String s = "-";

    Heroes() {
        s += "h1 ";
    }

    Heroes(int x) {
        s += "h2 ";
    }
}
