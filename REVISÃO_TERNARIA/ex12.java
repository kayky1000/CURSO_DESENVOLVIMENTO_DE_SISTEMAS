import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        String result = (number % 2 == 0)
                ? (number >= 0 ? "Par e Positivo" : "Par e Negativo")
                : (number >= 0 ? "Impar e Positivo" : "Impar e Negativo");
        System.out.println("O resultado é: " + result);
    }
}