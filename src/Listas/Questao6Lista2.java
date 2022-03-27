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
	
		//Alimentação da lista com 100 números
		for(int i = 0; i < range; i++) {
			lista[i] = gerador.nextInt(range);
			System.out.println("Posição "+(i+1)+" - ("+lista[i]+")");
			
			//Verificação de impares
			if (lista[i] != 0 && lista[i]%2 == 0) {
				par.add(lista[i]);
			}
		}
		
		//Apresentação de impares
		System.out.print("\n\n Os números pares são: ");
		for (int i = 0; i < par.size(); i++) {
			System.out.print(+par.get(i)+"; ");
		}
	}
}