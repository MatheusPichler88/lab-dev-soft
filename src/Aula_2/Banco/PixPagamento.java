package Aula_2.Banco;

public class PixPagamento extends MetodoPagamento{

    public PixPagamento(String nomeMetodo) {
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
        System.out.println("Realizado via Pix.");
        System.out.println("Id pagamento: "+idPagamento);
    }
}
