package Cap04;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = tec.nextInt();
		
		if (numero > 0) {
			System.out.println("O número informado é positivo");
		}else if(numero == 0) {
			System.out.println("O número informado é 0");
		}else {
			System.out.println("O número informado é negativo");
		}
	}

}
