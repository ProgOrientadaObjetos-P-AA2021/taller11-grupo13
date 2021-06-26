package taller11;
import java.util.ArrayList;
/**
 *
 * @author josep
 */
public class principal {

    public static void main(String[] args) {
        ArrayList<menu> listaMenu = new ArrayList<>();
        
        menuNinos menuniños1 = new menuNinos("combo ninos 1",
                2, 2.5, 3);
        menuNinos menuniños2 = new menuNinos("combo ninos 2", 3, 2, 2.5);

        menuEconomico menueconomico = new menuEconomico("papipollo", 1.5);

        menuDia menudia = new menuDia("almuerzos", 1.5, 2.5, 2);
        
        menuCarta menucarta = new menuCarta("cangrejos",
                1, 2.5, 1);

        listaMenu.add(menuniños1);
        listaMenu.add(menuniños2);
        listaMenu.add(menueconomico);
        listaMenu.add(menudia);
        listaMenu.add(menucarta);
        
        cuenta cuentaTotal = new cuenta("Jonathan Erazo", 2, listaMenu);
        
        System.out.println(cuentaTotal);
    }

}