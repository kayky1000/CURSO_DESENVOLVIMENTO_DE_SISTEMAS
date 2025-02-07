import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Você é estudante? (true/false): ");
        boolean estudante = scanner.nextBoolean();

        String resultado = (idade > 60 || estudante) ? "Qualificado para desconto" : "Não qualificado para desconto";
        System.out.println("Resultado: " + resultado);
    }
}