/*Muestra los números capicúa que hay entre 1 y 99999.*/
import funciones.ej1a14;
public class ej16 {
	public static void main(String[] args) {
	long i;
	for (i=1; i<=99999; i++) {
		if (funciones.ej1a14.esCapicua(i)) {
			System.out.printf("%d ", i);
		}
	}
	}
}
