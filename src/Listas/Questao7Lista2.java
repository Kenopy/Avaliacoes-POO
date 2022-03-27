package Listas;
//Imports
import java.util.Random;
public class Questao7Lista2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random
		Random gerador = new Random();
	
		//VarGlobais & Arrays
		int range = 100;
		int numMaior = 0;
		int numMenor = 0;
		int[] lista = new int[range];
	
		//Gerador
		for (int i = 0; i < lista.length; i++) {
			lista[i] = gerador.nextInt(range);
			System.out.println("posição "+(i+1)+" é " + lista[i]);
		}
	
		//Verificador Maior e Menor
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length; j++) {
				if (lista[j] > lista[i] && lista[j] > numMaior) {
					numMaior = lista[j];
				}else if(lista[j] < lista[i] && lista[j] < numMenor) {
					numMenor = lista[j];
				}
			}
		}

		//Impressao de Maior e Menor
		System.out.println("O maior número é: "+numMaior);
		System.out.println("O menor número é: "+numMenor);
	}
}
