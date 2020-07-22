package java_new;

import java.util.Locale;
import java.util.Scanner;


public class Exercicio_12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Escolha uma opção pelo código: %nCodigo     Especificação       Preço%n"
				+ "1         cachorro quente       R$4.00%n"
				+ "2         X-Salada	        R$4.50%n"
				+ "3         X-Bacon 	        R$5.00%n"
				+ "4         Torrada Simples       R$2.00%n"
				+ "5         Refrigerante	        R$1.00%n");
		int codigoProd = sc.nextInt();
		
		System.out.println("Informe a quantidade:");
		int qtdProd = sc.nextInt();
		
		double total;
		
		if (codigoProd == 1) {
			total = qtdProd * 4.00;
			System.out.printf("Você escolheu  "+ qtdProd + 
			" Cachorro-quente(s) e o valor total é: R$%.2f",total );
		} else if (codigoProd == 2){
			total = qtdProd * 4.50;
			System.out.printf("Você escolheu " + qtdProd +
					" X-Salada(s) e o valor total é: R$%.2f",total);
		}else if (codigoProd == 3) {
			total = qtdProd * 5.00;
			System.out.printf("Você escolheu " + qtdProd +
					" X-Bacon(s) e o valor total é: R$%.2f",total);
			
		}else if (codigoProd == 4) {
			total = qtdProd * 2.00;
			System.out.printf("Você escolheu " + qtdProd +
					" Torrada Simples(s) e o valor total é: R$%.2f",total);
		}else {
			total = qtdProd * 1.00;
			System.out.printf("Você escolheu " + qtdProd +
					" Refrigerante(s) e o valor total é: R$%.2f",total);
			sc.close();
		}
		
		

	}

}
