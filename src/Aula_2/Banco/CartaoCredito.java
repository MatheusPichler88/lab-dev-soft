package Aula_2.Banco;

public class CartaoCredito extends MetodoPagamento{

    public CartaoCredito(String nomeMetodo) {
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
        System.out.println("Realizado via Cartão de Crédito.");
        System.out.println("ID do pagamento: "+idPagamento);

    }
}
