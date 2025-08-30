package aula03ex2;

public class Losango implements FiguraGeometrica {
    private double d1;
    private double d2;

    public Losango(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public double calculaArea() {
        return (this.d1 * this.d2) / 2;
    }

    @Override
    public String getNomeFigura() {
        return "Losango";
    }
}
