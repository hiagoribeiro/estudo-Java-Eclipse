package java_new;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valorA = sc.nextInt();
	    int valorB = sc.nextInt();
	    int valorC = sc.nextInt();
	    int valorD = sc.nextInt();
	    int diferenca = (valorA * valorB - valorC * valorD);
	    
	    System.out.println("O valor da difença entre " + valorA+" x " + valorB + " - " + valorC + " x " + valorD + " = " + diferenca);
		
		sc.close();

	}

}
