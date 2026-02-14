public class NumberChecker1 {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0)
                return true;
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits)
            sum += Math.pow(d, power);
        return sum == num;
    }

    public static int[] largestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        return new int[]{largest, second};
    }

    public static int[] smallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }
        return new int[]{smallest, second};
    }
}
