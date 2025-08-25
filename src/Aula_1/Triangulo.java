package Aula_1;

public class Triangulo extends FormaGeometrica{
    private double b;
    private double h;

    @Override
    public double CalcularArea() {
        return (b*h)/2;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
