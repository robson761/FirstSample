import java.util.*;

/**
 * pobieranie danych z konsoli
 */

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//Pobranie pierwszej porcji danych
		System.out.print("Jak się nazywasz? ");
		String name = in.nextLine();

//Pobranie drugiej porcji danych
		System.out.print("Ile masz lat? ");
		int age = in.nextInt();

		//Wydruk danyc z konsoli
		System.out.println("Witaj użytkowniku " + name + ". W przyszłym roku będziesz miał " + (age + 1) + " lat.");
	}
}