import java.util.Scanner;
public class VotingEligibility {
    static int[] getAges(int n, Scanner sc) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    static String[][] checkVote(int[] ages) {
        String[][] data = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            data[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0)
                data[i][1] = "false";
            else if (ages[i] >= 18)
                data[i][1] = "true";
            else
                data[i][1] = "false";
        }
        return data;
    }

    static void display(String[][] data) {
        System.out.println("Age\tCanVote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = getAges(10, sc);
        String[][] result = checkVote(ages);
        display(result);

        sc.close();
    }
}
