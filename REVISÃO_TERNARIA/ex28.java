import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String resultado = (numero >= 20 && numero <= 30) ? "Dentro do intervalo" : "Fora do intervalo";
        System.out.println("O número está: " + resultado);
    }
}