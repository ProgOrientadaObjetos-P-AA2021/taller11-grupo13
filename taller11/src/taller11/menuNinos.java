package taller11;

/**
 *
 * @author josep
 */
public class menuNinos extends menu {

    private double valorHelado;
    private double valorPastel;

    public menuNinos(String n, double v, double vH, double vP) {
        super(n, v);
        valorHelado = vH;
        valorPastel = vP;
        establecerValorMenu();
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }

    public void establecerValorHelado(double vH) {
        valorHelado = vH;
    }

    public void establecerValorPastel(double vP) {
        valorPastel = vP;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("MENÚ DE NIÑO:\n"
                + "Nombre del plato: %s\n"
                + "Porción Helado: $%.2f\n"
                + "Porción pastel: $%.2f\n"
                + "Valor inicial del menú: $%.2f\n"
                + "Valor del menú: $%.2f\n-------------------\n",
                obtenerNombrePlato(),
                obtenerValorHelado(),
                obtenerValorPastel(),
                obtenerValorInicialMenu(),
                obtenerValorMenu());
        return cadena;
    }
}