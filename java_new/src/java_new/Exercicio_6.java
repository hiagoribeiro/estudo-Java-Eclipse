package java_new;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o Codigo da Pe�a 1");
		int codPc1 = sc.nextInt();
		System.out.println("Digite a Quantidade da Pe�a 1");
		int qtdPc1 = sc.nextInt();
		System.out.println("Digite o Valor da Pe�a 1");
		double vlrPc1 = sc.nextDouble();
		
		System.out.println("Digite o Codigo da Pe�a 2");
		int codPc2 = sc.nextInt();
		System.out.println("Digite a Quantidade da Pe�a 2");
		int qtdPc2 = sc.nextInt();
		System.out.println("Digite o Valor da Pe�a 2");
		double vlrPc2 = sc.nextDouble();
		
		double vlrPagar = (vlrPc1 * qtdPc1) + (vlrPc2 * qtdPc2);
		
		System.out.println("Comanda...........");
		System.out.println("Codigo da Pe�a 1: " + codPc1);
		System.out.println("Quantidades Pe�as 1 :" + qtdPc1 + " UN");
		System.out.println("Valor Unit�rio: R$:" +vlrPc1);
		System.out.println("Codigo da Pe�a 2: " + codPc2);
		System.out.println("Quantidades Pe�as 2 : "+ qtdPc2 + " UN");
		System.out.println("Valor Unitario: R$:"+  vlrPc2);
		System.out.printf("Total a ser Pago:>>> %.2f%n" , vlrPagar);
		
		
		sc.close();
		
	}

}
