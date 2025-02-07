import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor booleano (true/false): ");
        boolean valor = Boolean.parseBoolean(scanner.next());

        String resultado = (valor == true) ? "Sim" : "Não";
        System.out.println("O resultado é: " + resultado);
    }
}