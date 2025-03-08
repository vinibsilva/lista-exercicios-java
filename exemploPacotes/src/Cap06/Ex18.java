package Cap06;

public class Ex18 {

    public static void main(String[] args) {
        int numero = 10;

        System.out.println("numero = " + numero);
        alterarValor(numero);

        System.out.println("numero = " + numero);
    }
    
    public static void alterarValor(int valor) {
        valor = 20;
        System.out.println("valor = " + valor);
    }


}
