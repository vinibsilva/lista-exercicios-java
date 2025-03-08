package Cap02;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Insira dois números: ");
		int num1 = tec.nextInt();
		int num2 = tec.nextInt();
		
		System.out.println("A soma dos valores informados é igual a "+(num1+num2));
		System.out.println("A subtração dos valores informados é igual a "+(num1-num2));
		System.out.println("A multiplicação dos valores informados é igual a "+(num1*num2));
		System.out.println("A divisão dos valores informados é igual a "+(num1*num2));
		
		

	}

}
