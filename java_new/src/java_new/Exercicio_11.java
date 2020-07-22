package java_new;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o valor de A:");
		double A = sc.nextDouble();
		
		System.out.println("Escreva o valor de B:");
		double B = sc.nextDouble();
		
		System.out.println("Escreva o valor de C:");
		double C = sc.nextDouble();
		
		double triangulo = (A * C)/2;
		double raio = 3.14159 * (C*C);
		double trapezio = ((A+B)*C)/2;
		double quadrado = B * B ;
		double retangulo = A*B;
		
				
		// area do triangulo
		System.out.printf( "A area do triangulo é :%.3f%n",triangulo);
		System.out.printf("A area do circulo é :%.3f%n", raio);
		System.out.printf(" A area do trapézio é :%.3f%n", trapezio);
		System.out.printf("A area do quadrado é :%.3f%n", quadrado);
		System.out.printf("A area do quadrado é :%.3f%n", retangulo);
		sc.close();
	}

}
