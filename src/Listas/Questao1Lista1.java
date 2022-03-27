package Listas;

import java.util.Scanner;

public class Questao1Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//Var
		int numInt = 0;
		long numLong = 0l;
		float numFloat = 0f;
		
		System.out.print("Informe um numero Inteiro: ");
		numInt = teclado.nextInt();
		System.out.print("Informe um numero Long: ");
		numLong = teclado.nextLong();
		System.out.print("Informe um numero Float: ");
		numFloat = teclado.nextFloat();
		
		System.out.printf("O numero INT é: %d, o número LONG é: %d e o número FLOAT é: %.2f", numInt, numLong, numFloat);
		
	
	}

}
