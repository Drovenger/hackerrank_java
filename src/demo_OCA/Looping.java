package demo_OCA;

class Looping {
    public static void main(String[] args) {
        int i = 5, j = 3;
        do {
            System.out.print(i + " " + j + " ");
        } while (++j == 3 || i++ == 5);
    }
}
