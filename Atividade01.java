package aula_matrizes;

public class Atividade01 {

	public static void main(String[] args) {

		int soma = 0;
		int m[][] = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				m[i][j] = (int) Math.round(Math.random() * 1);
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Os valores são: " + m[i][j]);
				soma = soma + m[i][j];
			}
		}

		System.out.println("A soma é: " + soma);

	}

}
