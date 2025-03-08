package Cap03;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Informe uma frase: ");
		String frase = tec.nextLine();
		

		System.out.println("Número de caractéres da frase: "+ frase.length());
		System.out.println("A frase toda em maísculo: "+ frase.toUpperCase());
		System.out.println("A frase toda em minúsculo: " + frase.toLowerCase());
		System.out.println("Os 5 primeiros caracteres da frase: " + frase.substring(0,5));
	}

}
