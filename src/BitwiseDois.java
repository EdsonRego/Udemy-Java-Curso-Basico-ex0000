import java.util.Scanner;

public class BitwiseDois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mask = 0b00100000; // o numero 32 é 000100000, ou seja, o 6o bit vale 1
		int n = sc.nextInt();// teste com 89 e 113

		// vericando se o sexto bit vale 1
		if ((n & mask) != 0) {
			System.out.println("6th bit vale 1");
		} else {
			System.out.println("6th bite vale 0");
		}
		sc.close();
	}
}
