package Listas;
//Imports
import java.util.Random;
import java.util.ArrayList;

public class Questao6Lista2 {
	public static void main(String[] args) {
		//Random
		Random gerador = new Random();
	
		//Array e varGlobais
		int range = 100;
		int[] lista = new int[range];
	
		ArrayList<Integer> par = new ArrayList<Integer>();
	
		//Alimenta��o da lista com 100 n�meros
		for(int i = 0; i < range; i++) {
			lista[i] = gerador.nextInt(range);
			System.out.println("Posi��o "+(i+1)+" - ("+lista[i]+")");
			
			//Verifica��o de impares
			if (lista[i] != 0 && lista[i]%2 == 0) {
				par.add(lista[i]);
			}
		}
		
		//Apresenta��o de impares
		System.out.print("\n\n Os n�meros pares s�o: ");
		for (int i = 0; i < par.size(); i++) {
			System.out.print(+par.get(i)+"; ");
		}
	}
}