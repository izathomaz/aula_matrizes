package aula_matrizes;

public class Atividade02 {

	public static void main(String[] args) {

		int m[][] = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					m[i][j] = (int) Math.round(Math.random() * 10);
				}
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Os valores da matriz são: " + m[i][j]);
				System.out.println(i + "," + j + "|" + m[i][j]);
			}
		}

	}

}
