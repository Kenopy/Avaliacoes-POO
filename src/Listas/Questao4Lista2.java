package Listas;
//Imports
import java.util.Scanner;
import java.util.Random;

public class Questao4Lista2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		
		//Var & Arrays
		int[] list = new int[11];
		int[] primo = new int[11];
		
		//Preenchimento do array com n�meros rand�micos
		for (int i = 0; i < list.length; i++) {
			list[i] = gerador.nextInt(11);
			System.out.println("posi��o "+(i+1)+" � " + list[i]);
		}
		
		//Verifica��o de primos
		for (int i = 0; i < list.length; i++) {
			int cont = 0;
			for(int j = 1; j <= list[i]+1; j++){
				if (list[i] == 0 || list[i] == 1) {
			
				}else if(list[i]%j == 0){
					cont += 1;
				}
			}
			if (cont == 2) {
				System.out.println(list[i]+" � primo");
				primo[i] = list[i];
			}
		}
	}
}