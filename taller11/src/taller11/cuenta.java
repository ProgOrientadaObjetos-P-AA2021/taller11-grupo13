/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;
import java.util.ArrayList;
/**
 *
 * @author USUARIO 2020
 */
public class cuenta {

    private String nombreCliente;
    private double ivaPor;
    private double ivaVal;
    private ArrayList<menu> lista = new ArrayList<>();
    private double subtotal;
    private double total;

    public cuenta(String n, double i, ArrayList<menu> l) {
        nombreCliente = n;
        ivaPor = i;
        lista = l;
        establecerSubtotal();
        establecerIvaVal();
        establecerTotal();
    }

    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }

    public void establecerIvaPor(double i) {
        ivaPor = i;
    }

    public void establecerIvaVal() {
        ivaVal = (subtotal * ivaPor) / 100;
    }

    public void establecerLista(ArrayList<menu> l) {
        lista = l;
    }

    public void establecerSubtotal() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).obtenerValorMenu();
        }
        subtotal = suma;
    }

    public void establecerTotal() {
        total = subtotal + ivaVal;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public double obtenerIvaPor() {
        return ivaPor;
    }

    public double obtenerIvaVal() {
        return ivaVal;
    }

    public ArrayList<menu> obtenerLista() {
        return lista;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerTotal() {
        return total;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre del Cliente: %s\n"
                + "Listado de menus:\n",
                obtenerNombreCliente());
        for(int i = 0; i < lista.size(); i++){
            cadena = String.format("%sMenú %d\n%s\n-------------------\n",
                    cadena, i + 1, lista.get(i));
        }
        cadena = String.format("%sSubtotal: $%.2f\n"
                + "IVA %.2f%% = $%.2f\n"
                + "Total: $%.2f\n-------------------\n",
                cadena,
                obtenerSubtotal(),
                obtenerIvaPor(), obtenerIvaVal(),
                obtenerTotal());
        return cadena;
    }

}
