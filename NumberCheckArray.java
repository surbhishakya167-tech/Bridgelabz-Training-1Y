import java.util.Scanner;
public class NumberCheckArray{

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int n1, int n2) {
        if (n1 > n2)
            return 1;
        else if (n1 == n2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();

            if (isPositive(arr[i])) {
                if (isEven(arr[i]))
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            } else
                System.out.println("Negative");
        }

        int result = compare(arr[0], arr[4]);

        if (result == 1)
            System.out.println("First is greater");
        else if (result == 0)
            System.out.println("Both are equal");
        else
            System.out.println("Last is greater");
    }
}
