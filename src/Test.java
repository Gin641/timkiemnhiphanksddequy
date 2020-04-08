public class Test {
    static int[] lish = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] lish, int key){
        int low = 0;
        int high = lish.length -1 ;
        while (high >= low){
            int mid = (low + high) / 2;
            if (key < lish[mid]){
                high = mid - 1;
            }else if (key == lish[mid]){
                return mid;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(lish, 2));
        System.out.println(binarySearch(lish, 11));
        System.out.println(binarySearch(lish, 79));
        System.out.println(binarySearch(lish, 1));
        System.out.println(binarySearch(lish, 5));
        System.out.println(binarySearch(lish, 80));
    }
}
