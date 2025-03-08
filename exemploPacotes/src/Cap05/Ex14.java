package Cap05;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int a = tec.nextInt();
		int b = tec.nextInt();
		int c = tec.nextInt();
		
		if((a < c && a > b) || (a > c && a < b)) {
			System.out.println("A está entre os demais valores.");
		}else {
			System.out.println("A não está entre os demais valores.");
		}

	}

}
