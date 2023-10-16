// this program plays blackjack :))))
// unfortunately no double down or split yet... maybe more down the road
// you can only hit once... FOR NOW!
import java.util.Scanner;
public class BlackJack {

	public static void main(String[] args) {
		// Declare variables and arrays
		char looper = 'Y';
		Scanner input = new Scanner(System.in);

		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King"};

		// Initialize cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;

		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		// Display the first two cards
		for (int i = 0; i < 2; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println(rank + " of " + suit);
		}
		// Ask hit or stay and loop
		System.out.print("Hit (Y) or Stay? (Any other key)");
		looper = Character.toUpperCase(input.next().charAt(0));
		input.close();
		// Hit
		if (looper == 'Y') {
			hit('Y');
		}
	}
	public static void hit(char Y) {

		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King"};

		// Initialize cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;

		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		// Display the first two cards
		for (int i = 0; i < 1; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println(rank + " of " + suit);
		}
	}
}