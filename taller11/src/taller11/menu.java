package taller11;

/**
 *
 * @author josep
 */
public class menu {
    
    
    private String nombreCliente;
    private String listadoMenu;
    private double valorTotal;
    private double subtotal;
    private double Iva;

    public menu(String nombreCliente, String listadoMenu, double valorTotal, double subtotal, double Iva) {
        this.nombreCliente = nombreCliente;
        this.listadoMenu = listadoMenu;
        this.valorTotal = valorTotal;
        this.subtotal = subtotal;
        this.Iva = Iva;
    }

    public double getIva() {
        return Iva;
    }

    public void setIva(double Iva) {
        this.Iva = Iva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getListadoMenu() {
        return listadoMenu;
    }

    public void setListadoMenu(String listadoMenu) {
        this.listadoMenu = listadoMenu;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
}
