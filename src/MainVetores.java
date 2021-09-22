import java.util.Scanner;

public class MainVetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] vetor = new double [5];
		
		for(int i=0 ; i<N ; i++) {
			vetor[i] = sc.nextDouble();
		}
		for(int i=0 ; i<N ; i++) {
			System.out.printf("%.2f%n",vetor[i]);
		}
		
		
		sc.close();
	}

}
