package Listas;
//Imports
import java.util.Random;
import java.util.ArrayList;

public class Questao5Lista2 {
	public static void main(String[] args) {
		//Random
		Random gerador = new Random();
	
		//Array e varGlobais
		int range = 100;
		int[] list = new int[range];
		/*int[] impar = new int[range];*/
	
		ArrayList<Integer> impar = new ArrayList<Integer>();
	
		//Alimenta��o da lista com 100 n�meros
		for(int i = 0; i < range; i++) {
			list[i] = gerador.nextInt(range);
			System.out.println("Posi��o "+(i+1)+" - ("+list[i]+")");
		}
	
		//Verifica��o de impares
		for (int i = 0; i < list.length; i++) {
			if (list[i] != 0 && list[i]%2 != 0) {
			impar.add(list[i]);
			}
		}
	
		//Apresenta��o de impares
		System.out.print("\n\n Os n�meros impares s�o: ");
		for (int i = 0; i < impar.size(); i++) {
			System.out.print(+impar.get(i)+"; ");
		}
	}
}