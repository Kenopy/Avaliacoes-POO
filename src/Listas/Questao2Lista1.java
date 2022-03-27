package Listas;
import java.util.Scanner;

public class Questao2Lista1 {
	public static void main(String[] args) {
		//Var
		double imc = 0;
		double peso = 0;
		double altura = 0;
		Scanner teclado = new Scanner(System.in);
		//Apresentação
		System.out.println("Bem vindo a calculadora de IMC.");
		System.out.println("");
		
		//Entradas e Saídas
		System.out.print("Por favor informe seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("Por favor informe sua altura: ");
		altura = teclado.nextDouble()/100;
		
		//Calculo
		imc = peso/(altura * altura);
		
		//Resultado
		System.out.println("Seu IMC atual é: "+ imc +".");
	}
}
