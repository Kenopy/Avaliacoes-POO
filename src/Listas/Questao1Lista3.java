package Listas;
import java.util.Scanner;

public class Questao1Lista3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Informar o tamanho das matrizes 
		System.out.println("MATRIZ A");
		System.out.println("Informe a quantidade de linhas da matriz A: ");
		int linhaMA = teclado.nextInt();
		System.out.println("Informe a quantidade de colunas da matriz A: ");
		int colunaMA = teclado.nextInt();
		int [][] matrizA = new int[linhaMA][colunaMA];
		
		System.out.println("MATRIZ B");
		System.out.println("Informe a quantidade de linhas da matriz B: ");
		int linhaMB = teclado.nextInt();
		System.out.println("Informe a quantidade de colunas da matriz B: ");
		int colunaMB = teclado.nextInt();
		int [][] matrizB = new int[linhaMB][colunaMB];
		
		//A matriz resultante tem seu tamanho definido pela qtd de linha da MatrizA e qtd de colunas da matrizB
		int [][] matrizSoma = new int [linhaMA][colunaMB];
		
		
		
		//Verifica��o para soma
		if (linhaMA == linhaMB && colunaMA == colunaMB ) {
			//Alimenta��o matriz A
			for(int i = 0; i < linhaMA; i++) {
				for (int j = 0; j < colunaMA; j++) {
					System.out.print("Informe um valor para a matriz A"+(1+i)+(1+j)+": ");
					matrizA[i][j] = teclado.nextInt();
				}
				//Pular linha ap�s preencher linha atual
				System.out.println("");
			}
			//Impress�o Matriz A
			for(int i = 0; i < linhaMA; i++) {
				for (int j = 0; j < colunaMA; j++) {
					//Impress�o do valor de cada posi��o
					System.out.print(matrizA[i][j] + " ");
				}
				//Quebra de linha para cada mudan�a de linha
				System.out.println("");
			}
			
			
			//Alimenta��o matriz B
			System.out.println("");
			for(int i = 0; i < linhaMB; i++) {
				for (int j = 0; j < colunaMB; j++) {
					System.out.print("Informe um valor para a matriz B"+(1+i)+(1+j)+": ");
					matrizB[i][j] = teclado.nextInt();
				}
				//Pular linha ap�s preencher linha atual
				System.out.println("");
			}
			
			//Impress�o Matriz B
			for(int i = 0; i < linhaMB; i++) {
				for (int j = 0; j < colunaMB; j++) {
					//Impress�o do valor de cada posi��o
					System.out.print(matrizB[i][j] + " ");
				}
				//Quebra de linha para cada mudan�a de linha
				System.out.println("");
			}
			
			//Soma das matrizes
			for(int i = 0; i < linhaMA; i++) {
				for (int j = 0; j < colunaMA; j++) {
					matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j]; 
					//Impress�o do valor de cada posi��o
					//System.out.print(matrizSoma[i][j] + " ");
				}
				//Quebra de linha para cada mudan�a de linha
				//System.out.println("");
			}
			
			//Impress�o Matriz Soma
			System.out.println("\n\nO resultado da soma das matrizes �: ");
			for(int i = 0; i < linhaMA; i++) {
				for (int j = 0; j < colunaMA; j++) {
					//Impress�o do valor de cada posi��o
					System.out.print(matrizSoma[i][j] + " ");
				}
				//Quebra de linha para cada mudan�a de linha
				System.out.println("");
			}
			
		}else {
			System.out.println("A soma dessas matrizes n�o pode ser realizada");
		}
	}
}
