package Aula_1;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Matheus", 8, 7.5);
        System.out.println("Nome: "+aluno1.getNome());
        System.out.println("Media: "+aluno1.CalcularMedia(8.9,7.7));

        Carro carro1 = new Carro();
        carro1.setNome("Carro 1");
        System.out.println("=========================");
        carro1.ExibirMsg();

        Onibus onibus = new Onibus();
        onibus.setNome("Onibus 1");
        onibus.setModelo("Modelo X");
        System.out.println("Nome: "+onibus.getNome());
        System.out.println("Modelo: "+onibus.getModelo());
        onibus.ExibirMsg();

        Triangulo triangulo = new Triangulo();

        triangulo.setB(8);
        triangulo.setH(14);
        double area = 0;
        area = triangulo.CalcularArea();
        System.out.println("==========================");
        System.out.println("Area do triangulo: "+area);

        Casa casa = new Casa();
        double preco = casa.CalcularPreco(400, 6);
        System.out.println("Preço da casa: "+preco);
    }
}
