package Aula_2.Banco;

public class PayPal extends MetodoPagamento {

    public PayPal(String nomeMetodo) {
        super(nomeMetodo);
    }

    @Override
    public double metodoPagamento(double valor) {
        System.out.println("Pagamento realizado");
        return valor;
    }

    @Override
    public void mostrarDetalhesPagamento() {
        System.out.println("Detalhes do pagamento: ");
        System.out.println("Realizado via Paypal.");
        System.out.println("Id do pagamento: "+idPagamento);

    }
}
