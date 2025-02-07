import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        String result = (number % 3 == 0 && number % 5 == 0) ? "FizzBuzz" : Integer.toString(number);
        System.out.println("O resultado é: " + result);
    }
}