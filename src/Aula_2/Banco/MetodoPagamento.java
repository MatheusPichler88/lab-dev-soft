package Aula_2.Banco;

import java.util.Random;

public abstract class MetodoPagamento {
    protected String nomeMetodo;
    protected int idPagamento;
    protected Random gerador = new Random();

    public MetodoPagamento(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
        this.idPagamento = gerador.nextInt(10000);
    }

    public abstract double metodoPagamento(double valor);

    public abstract void mostrarDetalhesPagamento();
    }

