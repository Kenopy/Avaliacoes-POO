package Listas;
//Imports
import java.util.Scanner;

public class Questao2Lista2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner
		Scanner teclado = new Scanner(System.in);
		
		//Variaveis-Arrays
		int[] list = new int[10];
		
		//Intro
		System.out.println("Por favor, informe apenas números inteiros");
		
		//Entradas & Saidas
		for(int i = 0; i < list.length; i++){
			System.out.print("Informe o "+(i+1)+"º número:");
			list[i] = teclado.nextInt();
		}
		System.out.println("ok\n");
		//Resolução
		for (int count = list.length-1; count >= 0; count--){
			System.out.println("O valor na posição "+(count+1)+" é: "+list[count]);
		}
	}
}