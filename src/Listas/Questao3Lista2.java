package Listas;
//Imports
import java.util.Random;

public class Questao3Lista2 {
	public static void main(String[] args) {
		//Func
		Random gerador = new Random();
		
		//VarGlobais & Arrays
		int range = 9;
		int[] list = new int[range];
		
		//Alimenta��o do array
		for (int i = 0; i < list.length; i++) {
			list[i] = gerador.nextInt(range);
			System.out.println("posi��o "+(i+1)+" � " + list[i]);
		}
		
		//Sa�da do array em sequencia
		System.out.println("\n\nLista ordenada");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + ": ");
		}
		
		//Sa�da do array em sequ�ncia inversa
		System.out.println("\n\nLista em ordem inversa");
		for (int j = range-1; j >= 0; j--) {
			System.out.print(list[j] + ": ");
		}
	}
}
