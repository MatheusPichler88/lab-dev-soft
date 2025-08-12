package Aula_2.Interface;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora c = new Calculadora();
        int op = 1;
        double resultado = 0;
        while (op != 0) {
            System.out.println("Selecione o calculo");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração ");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Raiz Quadrada ");
            System.out.println("6 - Elevação na potência");
            System.out.println("7 - Logaritmo");
            System.out.println("0 - Sair");
            System.out.println("Escolha:");
            switch (op = sc.nextInt()) {
                case 1:
                    System.out.println("Digite o primeiro e o segundo valor: ");
                    resultado = c.somar(sc.nextDouble(), sc.nextDouble());
                    System.out.println("-----------------------");
                    System.out.println("Resultado: "+resultado);
                    System.out.println("-----------------------");
                    break;
                case 2:
                    System.out.println("Digite o primeiro e o segundo valor: ");
                    resultado = c.subtrair(sc.nextDouble(), sc.nextDouble());
                    System.out.println("-----------------------");
                    System.out.println("Resultado: "+resultado);
                    System.out.println("-----------------------");
                    break;
                case 3:
                    System.out.println("Digite o primeiro e o segundo valor: ");
                    resultado = c.multiplicar(sc.nextDouble(), sc.nextDouble());
                    System.out.println("-----------------------");
                    System.out.println("Resultado: "+resultado);
                    System.out.println("-----------------------");
                    break;
                case 4:
                    System.out.println("Digite o primeiro e o segundo valor: ");
                    resultado = c.dividir(sc.nextDouble(), sc.nextDouble());
                    System.out.println("-----------------------");
                    System.out.println("Resultado: "+resultado);
                    System.out.println("-----------------------");
                    break;
                case 5:
                    System.out.println("Digite o primeiro e o segundo valor: ");
                    resultado = c.raizQuadrada(sc.nextDouble(), sc.nextDouble());
                    System.out.println("-----------------------");
                    System.out.println("Resultado: "+resultado);
                    System.out.println("-----------------------");
                    break;
                case 6:
                    System.out.println("Digite o primeiro e o segundo valor: ");
                    resultado = c.elevarPotencia(sc.nextDouble(), sc.nextDouble());
                    System.out.println("-----------------------");
                    System.out.println("Resultado: "+resultado);
                    System.out.println("-----------------------");
                    break;
                case 7:
                    System.out.println("Digite o valor: ");
                    resultado = c.logaritmo10(sc.nextDouble());
                    System.out.println("-----------------------");
                    System.out.println("Resultado: "+resultado);
                    System.out.println("-----------------------");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}


