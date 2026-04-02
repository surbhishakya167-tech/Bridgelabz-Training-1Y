import java.util.ArrayList;
public class PerformanceTest {
    public static void main(String[] args) {
        int n = 1000000;

        long start1 = System.nanoTime();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        long sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i];
        }
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        long sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += list.get(i);
        }
        long end2 = System.nanoTime();

        System.out.println("int[] sum: " + sum1);
        System.out.println("Time for int[]: " + (end1 - start1) + " ns");

        System.out.println("ArrayList<Integer> sum: " + sum2);
        System.out.println("Time for ArrayList<Integer>: " + (end2 - start2) + " ns");
    }
}
