import java.util.Scanner;

public class Java_End_of_file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (scanner.hasNextLine()) {
            System.out.println(count + " " + scanner.nextLine());
            count++;
        }
    }
}
