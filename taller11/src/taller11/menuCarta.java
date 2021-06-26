package taller11;

/**
 *
 * @author josep
 */
public class menuCarta extends menu {

    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public menuCarta(String np,  double cI, double vP, double vB) {
        super(np, cI);
        valorPorcionGuarnicion = vP;
        valorBebida = vB;
        establecerPorcentajeAdicional();
        establecerValorMenu();
    }

    public void establecerValorPorcionGuarnicion(double n) {
        valorPorcionGuarnicion = n;
    }

    public void establecerValorBebida(double n) {
        valorBebida = n;
    }

    public void establecerPorcentajeAdicional() {
        porcentajeAdicional = valorInicialMenu * 0.10;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorBebida + valorPorcionGuarnicion
                + valorInicialMenu + porcentajeAdicional;
    }

    public double obtenerValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("MENÚ A LA CARTA:\n"
                + "Nombre del plato: %s\n"
                + "Valor porcion de guarnicion: $%.2f\n"
                + "Valor de bebida: $%.2f\n"
                + "Valor inicial del menú: $%.2f"
                + "Porcentaje de servicio: $%.2f\n"
                + "Valor del menu: $%.2f\n-------------------\n",
                obtenerNombrePlato(),
                obtenerValorPorcionGuarnicion(),
                obtenerValorBebida(),
                obtenerValorInicialMenu(),
                obtenerPorcentajeAdicional(),
                obtenerValorMenu());
        return cadena;
    }

}