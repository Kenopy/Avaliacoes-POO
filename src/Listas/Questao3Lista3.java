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
		
		
		
		//Bloco de verificação se os indices das matrizes são iguais
		System.out.println("");//pular linha apenas para melhor visualização no prompt
		if (colunaMA == linhaMB ) {
			//Alimentação matriz A
			for(int i = 0; i < linhaMA; i++) {
				for (int j = 0; j < colunaMA; j++) {
					System.out.print("Informe um valor para a matriz A"+(1+i)+(1+j)+": ");
					matrizA[i][j] = teclado.nextInt();
				}
				//Pular linha após preencher linha atual
				System.out.println("");
			}
			//Impressão Matriz A
			for(int i = 0; i < linhaMA; i++) {
				for (int j = 0; j < colunaMA; j++) {
					//Impressão do valor de cada posição da matrizA
					System.out.print(matrizA[i][j] + " ");
				}
				//Quebra de linha para cada mudança de linha
				System.out.println("");
			}
			
			
			//Alimentação matriz B
			System.out.println("");
			for(int i = 0; i < linhaMB; i++) {
				for (int j = 0; j < colunaMB; j++) {
					System.out.print("Informe um valor para a matriz B"+(1+i)+(1+j)+": ");
					matrizB[i][j] = teclado.nextInt();
				}
				//Pular linha após preencher linha atual
				System.out.println("");
			}
			
			//Impressão Matriz B
			for(int i = 0; i < linhaMB; i++) {
				for (int j = 0; j < colunaMB; j++) {
					//Impressão do valor de cada posição da matrizB
					System.out.print(matrizB[i][j] + " ");
				}
				//Quebra de linha para cada mudança de linha
				System.out.println("");
			}
			
			//multiplicação das matrizes
			for(int i = 0; i < linhaMA; i++) {
				for (int j = 0; j < colunaMB; j++) {
					for(int k = 0; k < linhaMB; k++) {
						matrizMult[i][j] += matrizA[i][k] * matrizB[k][j];
					}
					 
				}
			}
			
			//Impressão MatrizMult
			System.out.println("\n\n O resultado da multiplicação das matrizes é: ");
			for(int i = 0; i < linhaMA; i++) {
				for (int j = 0; j < colunaMB; j++) {
					//Impressão do valor de cada posição
					System.out.print(matrizMult[i][j] + " ");
				}
				//Quebra de linha para cada mudança de linha
				System.out.println("");
			}
			
		}else {
			System.out.println("A multiplicação dessas matrizes não pode ser realizada");
		}
	}
}
