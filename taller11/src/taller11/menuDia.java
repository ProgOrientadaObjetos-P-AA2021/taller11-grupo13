package taller11;

/**
 *
 * @author josep
 */
public class menuDia extends menu {

    private double valPostre;
    private double valBebida;

    public menuDia(String n,double v, double vP, double vB) {
        super(n, v);
        valPostre = vP;
        valBebida = vB;
        establecerValorMenu();
    }

    public void establecerValPostre(double vP) {
        valPostre = vP;
    }

    public void establecerValDeBebida(double vB) {
        valBebida = vB;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valBebida + valPostre;
    }

    public double obtenerValPostre() {
        return valPostre;
    }

    public double obtenerValBebida() {
        return valBebida;
    }

    @Override
    public String toString() {
        String cadena = String.format("MENÚ DEL DÍA:\n"
                + "Nombre del plato: %s\n"
                + "Postre: $%.2f\n"
                + "Bebida: $%.2f\n"
                + "Valor inicial del menú: $%.2f\n"
                + "valor del menú: $%.2f\n-------------------\n",
                obtenerNombrePlato(),
                obtenerValPostre(),
                obtenerValBebida(),
                obtenerValorInicialMenu(),
                obtenerValorMenu());
        return cadena;
    }

}