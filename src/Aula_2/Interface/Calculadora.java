package Aula_2.Interface;

public class Calculadora implements ICalculadora{
    private double a = 0;

    public double somar(double n1, double n2){
       return a = n1 + n2;
    }
    public double subtrair(double n1, double n2){
        return a = n1 - n2;
    }
    public double multiplicar(double n1, double n2){
        return a = n1 * n2;
    }
    public double dividir(double n1, double n2){
        return a = (n1 / n2);
    }
    public double raizQuadrada(double n1, double n2) {
        return Math.sqrt(n1 + n2);
    }

    public double elevarPotencia(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    public double logaritmo10(double n1) {
        return Math.log10(n1);
    }
}
