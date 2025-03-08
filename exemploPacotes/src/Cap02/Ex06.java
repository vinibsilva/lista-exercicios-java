package Cap02;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Insira um numero qualquer: ");
		int num = tec.nextInt();
		
		System.out.println(num+=3);
		System.out.println(num-=3);
		System.out.println(num*=3);
		System.out.println(num/=3);
		System.out.println(num%=3);
	}
}
