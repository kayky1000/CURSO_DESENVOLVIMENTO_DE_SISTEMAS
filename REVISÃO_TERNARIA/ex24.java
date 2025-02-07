import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String resultado = (isNumeroPerfeito(numero)) ? "Perfeito" : "Não Perfeito";
        System.out.println("O número é: " + resultado);
    }
    public static boolean isNumeroPerfeito(int numero) {
        int somaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == numero;
    }
}