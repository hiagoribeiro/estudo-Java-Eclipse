package java_new;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int soma = num1 + num2;
    
    
    System.out.println("a soma entre " + num1 + " + " + num2 + " = " + soma);
    
    
    sc.close();
	
	

	}

}
