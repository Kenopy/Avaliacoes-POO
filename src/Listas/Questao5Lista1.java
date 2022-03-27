package Listas;

import java.util.Scanner;

public class Questao5Lista1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor = 0;
		
		System.out.print("Por favor digite um número: ");
		valor = teclado.nextInt();
		
		if (valor % 2 == 0){
			System.out.println(valor + " é par");
		}else {
			System.out.println(valor + " é impar");
		}
	}
}
