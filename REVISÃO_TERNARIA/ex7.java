public class ex7 {
    public static void main(String[] args) {
        int numero = 10;

        String resultado = (numero > 0 && numero % 2 == 0) ? "Sim" : "Não";

        System.out.println("O número " + numero + " é positivo e par? " + resultado);
    }
}