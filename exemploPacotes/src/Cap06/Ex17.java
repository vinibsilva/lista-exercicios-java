package Cap06;

public class Ex17 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

        int c1 = calculadora.somar(5, 10);
        System.out.println("A soma é: " + c1);

        double c2 = calculadora.somar(3.14, 2.71);
        System.out.println("A soma é: " + c2);

        int[] numeros = {1, 2, 3, 4, 5};
        int c3 = calculadora.somar(numeros);
        System.out.println("A soma é: " + c3);

	}

}
class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
        }
}