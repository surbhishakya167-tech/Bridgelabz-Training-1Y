import java.util.Scanner;
public class RockPaperScissorsGame {
    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";

        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";

        return "Computer";
    }

    static String[][] stats(int userWin, int compWin, int total) {
        String[][] data = new String[2][3];

        double userPer = (userWin * 100.0) / total;
        double compPer = (compWin * 100.0) / total;

        data[0][0] = "User";
        data[0][1] = String.valueOf(userWin);
        data[0][2] = String.valueOf(userPer);

        data[1][0] = "Computer";
        data[1][1] = String.valueOf(compWin);
        data[1][2] = String.valueOf(compPer);

        return data;
    }

    static void displayGames(String[][] games, String[][] stat) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < games.length; i++) {
            System.out.println((i+1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nPlayer\tWins\tPercentage");
        for (int i = 0; i < stat.length; i++) {
            System.out.println(stat[i][0] + "\t" + stat[i][1] + "\t" + stat[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[][] games = new String[n][3];
        int userWin = 0, compWin = 0;

        for (int i = 0; i < n; i++) {
            String user = sc.next();
            String comp = computerChoice();
            String winner = findWinner(user, comp);

            games[i][0] = user;
            games[i][1] = comp;
            games[i][2] = winner;

            if (winner.equals("User")) userWin++;
            if (winner.equals("Computer")) compWin++;
        }

        String[][] stat = stats(userWin, compWin, n);
        displayGames(games, stat);

        sc.close();
    }
}
