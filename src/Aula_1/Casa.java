package Aula_1;

public class Casa {
    private double preco;
    private int tamanho;

    public double CalcularPreco(int tamanho){
        preco = 120000;
        tamanho = 80;

        return preco += tamanho;
    }

    public double CalcularPreco(int tamanho, int quartos){
        float preco;
        return preco = (4890*tamanho) + (730*quartos);
    }
}
