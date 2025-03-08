package Cap04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = tec.nextInt();
		int i = 1;
		
		while(i <=numero) {
			System.out.println(i);
			i++;
		}
	}

}
