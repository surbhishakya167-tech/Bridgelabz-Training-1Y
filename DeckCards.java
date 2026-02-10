import java.util.*;
public class DeckCards {
    static String[] initializeDeck(String[] suits, String[] ranks) {
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int k = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[k++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }
    static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    static String[][] distributeCards(String[] deck, int players, int cards) {
        if (players * cards > deck.length) return null;

        String[][] p = new String[players][cards];
        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                p[i][j] = deck[index++];
            }
        }
        return p;
    }

    static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        int players = sc.nextInt();
        int cards = sc.nextInt();

        String[][] result = distributeCards(deck, players, cards);

        if (result == null)
            System.out.println("Not possible");
        else
            printPlayers(result);
    }
}
