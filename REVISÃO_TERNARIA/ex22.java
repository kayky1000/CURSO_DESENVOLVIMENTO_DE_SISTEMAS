import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        String freteGratis = (valorProduto >= 100) ? "Frete grátis" : "Frete não grátis";
        System.out.println("O produto tem: " + freteGratis);
    }
}