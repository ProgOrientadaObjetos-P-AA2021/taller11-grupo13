# taller11


## Problemática

En un restaurant se tiene diferentes tipos de menú para ofrecer a los clientes. Un cuenta por pagar está compuesta por características como: nombre del cliente, listado de todos las cartas(menú) solicitados por el cliente, valor a cancelar total,  subtotal, Iva.

Los tipos de menú del restaurant son: 

**Menú a la Carta**

- nombre del plato
- valor del menú
* valor inicial del menú
* valor de porción de guarnición
* valor de bebida
* porcentaje adicional por servicio en relacion del valor inicial del menú

**Menú del Día**

* nombre del plato
* valor del menú
* valor inicial del menú
* valor de postre
* valor de bebida


**Menú de Niños**

* nombre del plato
* valor del menú
* valor inicial del menú
* valor de porcion de helado
* valor de porcion de pastel

**Menú Económico**

* nombre del plato
* valor del menú
* valor inicial del menú
* porcentaje de descuento, en referencia al valor inicial del menú


Para solucionar lo anterior de debe generar lo siguiente:

- Un diagrama exclusivo que imvolucren las clases de tipo Menú (usar polimorfismo
- Una solución en lenguaje de programación Java a través del IDE Netbeans. Usar Polimorfismo en la solución.
	* También debe existir en la solución un clase llamada Principal, donde conste el método main.
		* En dicho método se debe crear lo siguiente:
			*	Dos objetos de tipo menú de niños
			*	Un objeto de tipo menú de económico
			*      Un objeto de tipo menú del día
			* 	Un objeto de tipo menú a la carta.
			*	Un objeto de tipo Cuenta (con datos iniciales como: nombre del cliente, IVA, listado de cartas -menú-.
			* 	Hacer uso del método toString para presentar toda la información posible del objeto Cuenta (nombre del cliente, subtotal, iva, listado de todos los menú, valor a cancelar a total.
			