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
        tamanho = 80;
        quartos = 4;
        return preco += tamanho*quartos;
    }
}
