import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana (1 para Domingo, 2 para Segunda, ..., 7 para Sábado): ");
        int diaDaSemana = scanner.nextInt();
        String resultado = (diaDaSemana >= 2 && diaDaSemana <= 6) ? "Dia Util"
                : (diaDaSemana == 1 || diaDaSemana == 7) ? "Final de Semana"
                : "Dia inválido";
        System.out.println("O dia é: " + resultado);
    }
}