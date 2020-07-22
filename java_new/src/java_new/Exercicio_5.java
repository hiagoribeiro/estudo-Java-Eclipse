package java_new;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int numfunc = sc.nextInt();
		int horastrab = sc.nextInt();
		double valorhora =sc.nextDouble();
		double salario = horastrab * valorhora;
		
		System.out.println("Numero do Funcionario: " + numfunc);
		System.out.println("Trabalhou " + horastrab + " Horas");
		System.out.printf("Salário Final: %.2f%n ", salario);
		
		sc.close();

	}

}
