package Aula_1;

public class Carro {
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void ExibirMsg(){
        System.out.println("Estou na classe carro");
    }

}
