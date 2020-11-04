package loosely_coupled;

public class Level_3 {
    public interface SortAlgorithm {
        /**
         * Sắp xếp mảng đầu vào
         *
         * @param array
         */
        public void sort(int array[]);
    }

    public static class BubbleSortAlgorithm implements SortAlgorithm {

        @Override
        public void sort(int[] array) {
            // TODO: Add your logic here
            System.out.println("Đã sắp xếp bằng thuật toán sx nổi bọt");
        }
    }

    public static class QuicksortAlgorithm implements SortAlgorithm {
        @Override
        public void sort(int[] array) {
            // TODO: Add your logic here
            System.out.println("Đã sắp xếp bằng thuật sx nhanh");

        }
    }

    /******************************************************************************
     * Cách thứ ba này cũng là cách làm phổ biển nhất.                            *
     * Mối liên hệ giữa 2 Class đã "lỏng lẻo" hơn trước rất nhiều.                *
     * VeryComplexService sẽ không quan tâm tới việc thuật toán sắp xép là gì nữa,*
     * mà chỉ cần tập trung vào nghiệp vụ.                                        *
     * Còn SortAlgorithm sẽ được đưa vào từ bên ngoài tùy theo nhu cầu sử dụng.   *
     *****************************************************************************/
    public static class VeryComplexService {
        private SortAlgorithm sortAlgorithm;

        public VeryComplexService(SortAlgorithm sortAlgorithm) {
            this.sortAlgorithm = sortAlgorithm;
        }

        public void complexBusiness(int array[]) {
            sortAlgorithm.sort(array);
            // TODO: more logic here
        }
    }

    public static void main(String[] args) {
        SortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        SortAlgorithm quickSortAlgorithm = new QuicksortAlgorithm();
        VeryComplexService business1 = new VeryComplexService(bubbleSortAlgorithm);
        VeryComplexService business2 = new VeryComplexService(quickSortAlgorithm);
    }
}
