public class NumberChecker2 {
    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += d;
        return sum;
    }

    public static double sumSquares(int[] digits) {
        double sum = 0;
        for (int d : digits)
            sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        return num % sumDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++)
            freq[i][0] = i;

        for (int d : digits)
            freq[d][1]++;

        return freq;
    }
}
