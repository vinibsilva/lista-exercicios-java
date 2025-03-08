package Cap02;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Insira um valor para a base do triângulo: ");
		double base = tec.nextDouble();
		System.out.println("Insiro um valor para a altura do triângulo: ");
		double altura = tec.nextDouble();
		
		System.out.println("O valor da área desse triângulo é "+(base*altura));

	}

}
