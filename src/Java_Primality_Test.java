import java.util.Scanner;

public class Java_Primality_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
    }
}
