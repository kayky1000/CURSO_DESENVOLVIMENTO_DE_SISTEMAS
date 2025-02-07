public class ex3 {
    public static void main(String[] args) {
        int numero = -5;

        String resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero";

        System.out.println("O número " + numero + " é " + resultado);
    }
}