import java.util.Scanner;

public class Java_String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.equals(new StringBuilder(A)
                .reverse()
                .toString()) ? "Yes" : "No");
    }
}
