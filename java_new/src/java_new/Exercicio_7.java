package java_new;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		int valor = sc.nextInt();
		
		if (valor < 0) {
			System.out.println("numero negativo");
		}else {
			System.out.println("numero positivo");
		}
		sc.close();

	}

}
