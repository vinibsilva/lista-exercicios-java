package Cap05;

import java.util.Iterator;

public class Ex13 {

	public static void main(String[] args) {
		int soma = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0){
				soma+=i;
			}
		}
		
		System.out.println("A soma dos pares é igual a "+soma);

	}

}
