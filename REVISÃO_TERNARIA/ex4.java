public class ex4 {
    public static void main(String[] args) {
        int numero = 10;

        String resultado = (numero % 5 == 0) ? "Multiplo de 5" : "Não é multiplo de 5";

        System.out.println("O número " + numero + " é " + resultado);
    }
}