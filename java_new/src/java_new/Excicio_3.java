package java_new;

import java.util.Locale;
import java.util.Scanner;

public class Excicio_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double area = 3.14159 * (raio * raio);
		
		System.out.printf("Area do circulo � = %.4f%n" , area);
		
		sc.close();
		

	}

}
