package Geometria;


public abstract class Figuras {
    protected double area;
    protected double perimetro;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}

