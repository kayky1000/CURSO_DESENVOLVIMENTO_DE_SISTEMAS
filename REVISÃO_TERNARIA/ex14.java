import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        String result = (number >= 10 && number <= 50) ? "Dentro do Intervalo" : "Fora do Intervalo";
        System.out.println("O resultado é: " + result);
    }
}