import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String resultado = (numero >= 0) ? "Positivo ou Zero" : "Negativo";
        System.out.println("O número é: " + resultado);
    }
}