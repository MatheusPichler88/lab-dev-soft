package Aula_2.Banco;

public class PayPal extends MetodoPagamento {

    public PayPal(String nomeMetodo) {
        super(nomeMetodo);
    }

    @Override
    public double processaPagamento(double valor) {
        this.valorPagamento = valor;
        System.out.println("Pagamento realizado");
        return valor;
    }

    @Override
    public void mostrarDetalhesPagamento() {
        System.out.println("-------------------------");
        System.out.println("Detalhes do pagamento: ");
        System.out.println("Realizado via "+nomeMetodo);
        System.out.println("Valor: "+valorPagamento);
        System.out.println("Id do pagamento: "+idPagamento);
        System.out.println("-------------------------");

    }
}
