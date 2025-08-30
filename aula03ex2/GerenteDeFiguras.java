package aula03ex2;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<>();
    }

    public void adicionaFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    public void imprimeFiguras() {
        for (FiguraGeometrica f : figuras) {
            System.out.println(f.getNomeFigura());
        }
    }

    public double getMaiorAreaDeFigura() {
        double maior = 0;
        for (FiguraGeometrica f : figuras) {
            if (f.calculaArea() > maior) {
                maior = f.calculaArea();
            }
        }
        return maior;
    }

    public double getAreaTotal() {
        double soma = 0;
        for (FiguraGeometrica f : figuras) {
            soma += f.calculaArea();
        }
        return soma;
    }
}
