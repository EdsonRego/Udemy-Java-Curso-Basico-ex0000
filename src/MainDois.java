import java.util.Scanner;

public class MainDois {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horas;

		System.out.println("Digite uma hora: ");

		horas = sc.nextInt();

		if (horas < 12) {
			System.out.println("Bom dia!");
		} else if (horas < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa Noite!");
		}
		sc.close();
	}
}
