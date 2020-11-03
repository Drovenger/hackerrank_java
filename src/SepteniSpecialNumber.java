import java.util.ArrayList;

public class SepteniSpecialNumber {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(4);
        input.add(10);
        input.add(100);
        input.add(555);
        input.add(888);
        input.add(1000);
        input.add(5555);
        input.add(55555);
        for (int integer : input) {
            System.out.println(integer + ":" + generateSpecialNumber(integer));
        }
    }

    public static String generateSpecialNumber(int n) {
        final int[] arr = {2, 3, 4};
        final int size = arr.length;
        int temp = n - 1, index;
        StringBuilder string = new StringBuilder();
        while (temp >= 0) {
            index = temp % size;
            temp = temp / size - 1;
            string.append(arr[index]);
        }
        StringBuilder reverseString = new StringBuilder(string.toString());
        return reverseString.reverse().toString() + string;
    }
}
