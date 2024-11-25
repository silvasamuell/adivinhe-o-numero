package adivinha;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();

		int numeroAleatorio = random.nextInt(101);

		Scanner scanner = new Scanner(System.in);

		int resposta;

		System.out.println("Adivinhe o número (de 0 a 100)");

		do {

			resposta = scanner.nextInt();

			if (numeroAleatorio > resposta) {
				System.out.println("O número é maior do que " + resposta);
			} else if (numeroAleatorio < resposta) {
				System.out.println("O número é menor do que " + resposta);
			} else {
				System.out.println("Parabéns, você acertou");
			}

		} while (numeroAleatorio != resposta);

		scanner.close();

	}

}
