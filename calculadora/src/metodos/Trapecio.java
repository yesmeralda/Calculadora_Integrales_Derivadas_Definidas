package metodos;


import metodosnum.Funcion;

public class Trapecio extends Base {

    public Trapecio() {
        this.espaciado = 0;
        this.decimales = 10;
    }

    public double evaluar(Funcion funcion, double a, double b, int n) {

        double resultado = 0;
        resultado += funcion.evaluar(a);


        double h = (b - a) / n;
        double partes = 0;
        for (int i = 1; i < n; i++) {

            partes += funcion.evaluar(a + i * h);
        }
        resultado += (2 * partes);

        resultado += funcion.evaluar(b);
        resultado *= ((b - a) / (2 * n));

        return resultado;

    }

    public Double evaluar(funcion.Funcion f, Double valueOf, Double valueOf0, Integer valueOf1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
