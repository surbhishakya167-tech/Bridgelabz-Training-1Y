public class MatrixOperations2 {

    public static double[][] createRandomMatrix(int n) {
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = (int)(Math.random() * 5 + 1);
        return matrix;
    }

    public static double[][] transpose(double[][] matrix) {
        int n = matrix.length;
        double[][] result = new double[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[j][i] = matrix[i][j];

        return result;
    }

    public static double determinant2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        double[][] inv = new double[2][2];

        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        double[][] matrix2 = createRandomMatrix(2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2);

        System.out.println("Transpose:");
        displayMatrix(transpose(matrix2));

        System.out.println("Determinant:");
        System.out.println(determinant2x2(matrix2));

        System.out.println("Inverse:");
        displayMatrix(inverse2x2(matrix2));

        double[][] matrix3 = createRandomMatrix(3);
        System.out.println("3x3 Matrix:");
        displayMatrix(matrix3);

        System.out.println("Determinant:");
        System.out.println(determinant3x3(matrix3));
    }
}
