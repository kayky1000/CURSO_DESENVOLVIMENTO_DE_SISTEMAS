import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento do primeiro lado: ");
        int lado1 = scanner.nextInt();

        System.out.print("Digite o comprimento do segundo lado: ");
        int lado2 = scanner.nextInt();

        System.out.print("Digite o comprimento do terceiro lado: ");
        int lado3 = scanner.nextInt();

        String tipoTriangulo;
        if (lado1 == lado2 && lado2 == lado3) {
            tipoTriangulo = "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            tipoTriangulo = "Isósceles";
        } else {
            tipoTriangulo = "Escaleno";
        }

        System.out.println("O triângulo é: " + tipoTriangulo);
    }
}