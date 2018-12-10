/*Muestra los números primos que hay entre 1 y 1000.*/
import funciones.ej1a14;
public class ej15 {
	public static void main(String[] args) {
	int i;
	for (i=1; i<=1000; i++) {
		if (funciones.ej1a14.esPrimo(i)) {
			System.out.printf("%d ", i);
		}
	}
	}
}
