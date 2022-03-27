package Listas;
import java.util.Scanner;

public class Questao3Lista3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Informar o tamanho das matrizes A e B 
		System.out.println("MATRIZ A");
		System.out.print("Informe a quantidade de linhas da matriz A: ");
		int linhaMA = teclado.nextInt();
		System.out.print("Informe a quantidade de colunas da matriz A: ");
		int colunaMA = teclado.nextInt();
		int [][] matrizA = new int[linhaMA][colunaMA];
		
		System.out.println("\nMATRIZ B");
		System.out.print("Informe a quantidade de linhas da matriz B: ");
		int linhaMB = teclado.nextInt();
		System.out.print("nInforme a quantidade de colunas da matriz B: ");
		int colunaMB = teclado.nextInt();
		int [][] matrizB = new int[linhaMB][colunaMB];
		
		//A matriz resultante tem seu tamanho definido pela qtd de linha da MatrizA e qtd de colunas da matrizB
		int [][] matrizMult = new int [linhaMA][colunaMB];
		
		
		
		//Bloco de verifica��o se os indices das matrizes s�o iguais
		System.out.println("");//pular linha apenas para melhor visualiza��o no prompt
		if (colunaMA == linhaMB ) {
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
					//Impress�o do valor de cada posi��o da matrizA
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
					//Impress�o do valor de cada posi��o da matrizB
					System.out.print(matrizB[i][j] + " ");
				}
				//Quebra de linha para cada mudan�a de linha
				System.out.println("");
			}
			
			//multiplica��o das matrizes
			for(int i = 0; i < linhaMA; i++) {
				for (int j = 0; j < colunaMB; j++) {
					for(int k = 0; k < linhaMB; k++) {
						matrizMult[i][j] += matrizA[i][k] * matrizB[k][j];
					}
					 
				}
			}
			
			//Impress�o MatrizMult
			System.out.println("\n\n O resultado da multiplica��o das matrizes �: ");
			for(int i = 0; i < linhaMA; i++) {
				for (int j = 0; j < colunaMB; j++) {
					//Impress�o do valor de cada posi��o
					System.out.print(matrizMult[i][j] + " ");
				}
				//Quebra de linha para cada mudan�a de linha
				System.out.println("");
			}
			
		}else {
			System.out.println("A multiplica��o dessas matrizes n�o pode ser realizada");
		}
	}
}
