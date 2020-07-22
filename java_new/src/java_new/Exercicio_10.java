package java_new;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a hora de inicio de 0 a 24");
		int inicio = sc.nextInt();
		System.out.println("Insira a hora de termini de 0 a 24");
		int termino =sc.nextInt();
		
		int duracao;
		
		if (inicio < termino) {
			duracao = termino - inicio; 
			
		} else {
			duracao = 24 - inicio + termino;
		}
			System.out.println("o Jogo durou: " + duracao);
	
		
		
		
		sc.close();
	}

}
