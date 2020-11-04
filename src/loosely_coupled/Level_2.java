package loosely_coupled;

public class Level_2 {
    public interface SortAlgorithm {
        /**
         * Sắp xếp mảng đầu vào
         *
         * @param array
         */
        public void sort(int array[]);
    }

    public class BubbleSortAlgorithm implements SortAlgorithm {

        @Override
        public void sort(int[] array) {
            // TODO: Add your logic here
            System.out.println("Đã sắp xếp bằng thuật toán sx nổi bọt");
        }
    }

    /**
     * Với cách làm này, VeryComplexService sẽ chỉ quan hệ với một interface SortAlgorithm.
     * Với cách này thì mỗi quan hệ giảm bớt sự liên kết,
     * nhưng nó không thay đổi được việc thuật toán vẫn đang là BubbleSortAlgorithm.
     */
    public class VeryComplexService {
        private SortAlgorithm sortAlgorithm;

        public VeryComplexService() {
            sortAlgorithm = new BubbleSortAlgorithm();
        }

        public void complexBusiness(int array[]) {
            sortAlgorithm.sort(array);
            // TODO: more logic here
        }
    }
}
