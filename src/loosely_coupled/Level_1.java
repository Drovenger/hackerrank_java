package loosely_coupled;

public class Level_1 {
    public class BubbleSortAlgorithm {

        public void sort(int[] array) {
            // TODO: Add your logic here
            System.out.println("Đã sắp xếp bằng thuật toán sx nổi bọt");
        }
    }

    //khi có yêu cầu thay đổi thuật toán sắp xếp sang QuickSort thì nghe vẻ chúng ta sẽ phải sửa lại hoàn toàn cả 2 Class trên.
    public class VeryComplexService {
        //BubbleSortAlgorithm sẽ chỉ tồn tại nếu VeryComplexService tồn tại
        private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        //VeryComplexService tạo đối tượng BubbleSortAlgorithm bên trong nó (hay nói cách khác là sự sống chết của
        //BubbleSortAlgorithm sẽ do VeryComplexService quyết định),
        //theo như cách implement này, nó là liên kết rất chặt với nhau.
        public VeryComplexService() {
        }

        public void complexBusiness(int array[]) {
            bubbleSortAlgorithm.sort(array);
            // TODO: more logic here
        }
    }
}