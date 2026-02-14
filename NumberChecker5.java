public class NumberChecker5 {
    public static int sumProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0)
                sum += i;
        return sum;
    }

    public static boolean isPerfect(int num) {
        return sumProperDivisors(num) == num;
    }

    public static boolean isAbundant(int num) {
        return sumProperDivisors(num) > num;
    }

    public static boolean isDeficient(int num) {
        return sumProperDivisors(num) < num;
    }

    public static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int d = temp % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++)
                fact *= i;
            sum += fact;
            temp /= 10;
        }
        return sum == num;
    }
}
