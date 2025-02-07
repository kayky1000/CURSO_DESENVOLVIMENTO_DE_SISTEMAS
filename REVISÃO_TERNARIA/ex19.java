import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String resultado = (numero % 2 == 0 || numero % 3 == 0) ? "Divisivel" : "Não divisivel";
        System.out.println("O resultado é: " + resultado);
    }
}