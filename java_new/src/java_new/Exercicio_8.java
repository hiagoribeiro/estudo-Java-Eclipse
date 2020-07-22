package java_new;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero:");
		int valor = sc.nextInt();
		int resultado = valor % 2;
		
		if (resultado == 0 ) {
			System.out.println("numero par");
			
		}else {
			System.out.println("numero impar3");
		}
			
		
		sc.close();
	}

}
