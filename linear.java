public class linear {

    static int linearsearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static void binarysearch(int[] arr, int key) {
        System.out.println("Binary Search :");
        int l = 0, r = arr.length;
        while (l <= r) {
            int m = r + (l - r) / 2;
            if (arr[m] == key) {
                System.out.println("Element found in index " + m);
                return;
            } else if (arr[m] > key) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] aa = { 1, 10, 230, 444, 567, 766, 6969 };
        int key = 766;

        long start = System.nanoTime();
        int bb = linearsearch(aa, key);
        long end = System.nanoTime();
        float time = (end - start) / 1000F;
        System.out.println("Linear Search : \nElement found in index  " + bb);
        long start1 = System.nanoTime();
        binarysearch(aa, key);
        long end1 = System.nanoTime();
        float time1 = (end1 - start1) / 1000F;

        System.out.println("Time taken linear : " + time);
        System.out.println("Time taken binary: " + time1);
        System.out.println("Time taken at start linear: " + start);
        System.out.println("Time taken at end linaear: " + end);
        System.out.println("Time taken at start binary: " + start1);
        System.out.println("Time taken at end binary: " + end1);

    }

}
