package heranca4;

class PagamentoDinheiro extends Pagamento{

    @Override
    public void RealizarPagamento(){
        System.out.println("\nIniciando pagamento em dinheiro");
        super.RealizarPagamento();
        System.out.println("Pagamento em dinheiro realizado com sucesso");
    }

}