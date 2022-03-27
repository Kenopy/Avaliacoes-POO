package Listas;
import java.util.Scanner;
public class Questao3Lista1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double area = 0;
		double baseMaior = 0;
		double baseMenor = 0;
		double altura = 0;
	
		//Apresentação
		System.out.println("Bem vindo a calculadora de area de trapézios, por gentileza informe todos os valores em CM.");
		//Enradas e Saídas
		System.out.print("Por favor informe a base maior: ");
		baseMaior =  teclado.nextDouble();
		System.out.print("Agora informe a base menor: ");
		baseMenor = teclado.nextDouble();
		System.out.print("Agora informe a informe a altura:");
		altura = teclado.nextDouble();
		//Cálculo
		area = (baseMaior + baseMenor) * altura / 2;
		//Resultado
		System.out.println("A área do trapézio em CM² é: "+ area);
	}
}
