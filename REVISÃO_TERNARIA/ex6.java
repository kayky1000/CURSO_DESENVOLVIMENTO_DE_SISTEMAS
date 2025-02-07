public class ex6 {
    public static void main(String[] args) {
        int idade = 20;
        boolean possuiCarteira = true;

        String podeDirigir = (idade >= 18 && possuiCarteira) ? "Pode dirigir" : "Não pode dirigir";

        System.out.println("A pessoa com idade de " + idade + " anos " + podeDirigir);
    }
}