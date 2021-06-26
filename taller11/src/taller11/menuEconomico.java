package taller11;

/**
 *
 * @author josep
 */
public class menuEconomico extends menu {

    private double porcentajeDescuento;

    public menuEconomico(String n, double v) {
        super(n, v);
        establecerPorcentajeDescuento();
        establecerValorMenu();
    }

    public void establecerPorcentajeDescuento() {
        porcentajeDescuento = valorInicialMenu * 0.50;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu - porcentajeDescuento;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico:\n%s"
                + "Descuento: $%.2f\n-------------------\n", super.toString(),
                obtenerPorcentajeDescuento());
        return cadena;
    }

}
