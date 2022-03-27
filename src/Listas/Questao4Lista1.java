package Listas;
import java.util.Scanner;
public class Questao4Lista1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor1 = 0;
		int valor2 = 0;
		
		System.out.print("Por favor informe um número inteiro: ");
		valor1 = teclado.nextInt();
		System.out.print("Por favor informe outro número inteiro: ");
		valor2 = teclado.nextInt();
		
		if(valor1 > valor2) {
			System.out.println("O 1º número inserido foi o maior!");
		}else if(valor1 < valor2) {
			System.out.println("O 2º número inserido foi o maior!");
		}else {
			System.out.println("Os números são iguais!");
		}
	}
}
