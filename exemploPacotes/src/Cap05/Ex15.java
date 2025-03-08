package Cap05;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int num, soma = 0;
		
		do {
			System.out.println("Informe o número: ");
			num = tec.nextInt();
			if(num>0) {
				soma++;
			}
			
		}while(num>0);
		System.out.println(soma);
	}

}
