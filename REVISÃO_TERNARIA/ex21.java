import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String paridade = (numero % 2 == 0) ? "Par" : "Ímpar";
        String sinal = (numero >= 0) ? "Positivo" : "Negativo";
        System.out.println("O número é: " + paridade + " e " + sinal);
    }
}