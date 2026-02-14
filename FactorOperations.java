public class FactorOperations {
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                factors[index++] = i;

        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors)
            sum += f;
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for (int f : factors)
            product *= f;
        return product;
    }

    public static double productCubeFactors(int[] factors) {
        double product = 1;
        for (int f : factors)
            product *= Math.pow(f, 3);
        return product;
    }
}
