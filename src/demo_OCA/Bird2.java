package demo_OCA;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Bird2 {
    int ozWeight;
    boolean canTalk;

    Bird2(int w, boolean talk) {
        ozWeight = w;
        canTalk = talk;
    }

    int getW() {
        return ozWeight;
    }

    boolean getTalk() {
        return canTalk;
    }

    public String toString() {
        return "" + getW() + "" + getTalk();
    }

    public static void main(String[] args) {
        ArrayList<Bird2> birds = new ArrayList<>();
        birds.add(new Bird2(1, true));
        birds.add(new Bird2(1, false));
        birds.add(new Bird2(48, false));
        birds.add(new Bird2(32, true));
        System.out.println("medium birds: " + sorter(birds, b -> b.getW() == 32));
    }

    static ArrayList<Bird2> sorter(ArrayList<Bird2> blist,
                                   Predicate<Bird2> expr) {
        ArrayList<Bird2> result = new ArrayList<>();
        for (Bird2 b : blist) {
            if (expr.test(b)) {
                result.add(b);
            }
        }
        return result;
    }
}
