package Listas;
//Imports
import java.util.Scanner;

public class Questao1Lista2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner
		Scanner teclado = new Scanner(System.in);
		
		//Variaveis-Arrays
		int[] list = new int[5];
		int soma = 0;
		int media = 0;
		
		//Intro
		System.out.println("Bem vindo a calculadora de m�dia aritm�tica, por favor informe n�meros inteiros.\n");

		//Entradas & Saidas
		for (int i = 0; i < list.length; i++ ){
			System.out.print("Informe o "+(i+1)+"� valor: ");
			list[i] = teclado.nextInt();
			soma += list[i];
		}
		
		System.out.println("A soma �: "+ soma);
		
		//C�lculo
		media = soma/list.length;
		
		//Resolu��o
		System.out.println("A m�dia aritm�tica dos valores informados �: "+media);
	}

}