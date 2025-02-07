public class ex5 {
    public static void main(String[] args) {
        int ano = 2025;

        String resultado = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? "Ano Bissexto" : "Não é Ano Bissexto";

        System.out.println("O ano " + ano + " é " + resultado);
    }
}