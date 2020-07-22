package java_new;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio_9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero:");
		int n1 =sc.nextInt();
		System.out.println("Insira o segundo numero:");
		int n2 =sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 ==0 ) {
			System.out.println("Numeros Multiplos");
			
		}else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	}

}
