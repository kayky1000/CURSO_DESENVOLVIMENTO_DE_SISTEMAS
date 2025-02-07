import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char character = scanner.next().charAt(0);
        String result = (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')
                ? "Vogal" : "Consoante";
        System.out.println("O caractere digitado é: " + result);
    }
}