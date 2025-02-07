import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        String resultado = (idade >= 18 && idade <= 60) ? "Adulto"
                : (idade > 60) ? "Idoso"
                : "Jovem";

        System.out.println("A pessoa é: " + resultado);
    }
}