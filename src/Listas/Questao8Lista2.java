package Listas;

import java.util.Random;

public class Questao8Lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random
		Random gerador = new Random();
		
		//VarGlobais & Arrays
		int range = 100;
		double soma = 0;
		double media = 0;
		int[] lista = new int[range];
		
		//Gerador
		for (int i = 0; i < lista.length; i++) {
			lista[i] = gerador.nextInt(100);
			System.out.println("posi��o "+(i+1)+" � " + lista[i]);
		}
		
		//Soma
		for (int i = 0; i < lista.length; i++) {
			soma += lista[i];
		}
		//Calculo
		media = soma/range;
		System.out.printf("A m�dia aritim�tica dos %d n�meros gerados �: %.2f.",range, media);
	}

}