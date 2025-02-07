import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        String resultado = (nota >= 7) ? "Aprovado"
                : (nota >= 5 && nota < 7) ? "Recuperação"
                : "Reprovado";

        System.out.println("O aluno está: " + resultado);
    }
}