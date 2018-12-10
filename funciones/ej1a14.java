/*Crea una biblioteca de funciones matemáticas que contenga las siguientes
funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
Observa bien lo que hace cada función ya que, si las implementas en el orden
adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil
de implementar teniendo esPrimo.*/
package funciones;
public class ej1a14 {
	/*1. esCapicua: Devuelve verdadero si el número que se pasa como pará-
	metro es capicúa y falso en caso contrario.*/
	public static boolean esCapicua(long numero) {
		long introducido = numero;
		long volteado = 0;
		// Voltea el número introducido.
		while (numero > 0) {
			volteado = (volteado * 10) + (numero % 10);
			numero /= 10;
		} // while
		
		if (volteado == introducido) {
			return true;
		} else {
			return false;
		}
	}

	/*2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
	es primo y falso en caso contrario.*/
	public static boolean esPrimo(int numero) {
		int i;
		boolean primo = true;
		for (i=2; (i<numero) && primo; i++) {
			if (numero%i==0) {
				primo = false;
			}
		}
		return primo;
	}

	/*3. siguientePrimo: Devuelve el menor primo que es mayor al número que
	se pasa como parámetro.*/
	public static int siguientePrimo(int numero) {
		int i;
		boolean primo;
    do {
			numero++;
			primo = true;
			for (i=2; (i<numero) && primo; i++) {
				if (numero%i==0) {
					primo = false;
				}
			}
		} while(!primo);
		return numero;
	}

	/*4. potencia: Dada una base y un exponente devuelve la potencia.*/
	public static long potencia(long base, long exp) {
		int i;
		for (i=1; i<exp; i++) {
			base *= base;
		}
		return base;
	}

	/*5. digitos: Cuenta el número de dígitos de un número entero.*/
	public static int digitos(long numero) {
		int digitos = 0;
		while(numero>0){
			numero /= 10;
			digitos++;
		}
		return digitos;
	}

	/*6. voltea: Le da la vuelta a un número.*/
	public static long voltea(long numero) {
		long volteado = 0;
		// Voltea el número introducido.
		while (numero > 0) {
			volteado = (volteado * 10) + (numero % 10);
			numero /= 10;
		} // while
		return volteado;
	}

	/*7. digitoN: Devuelve el dígito que está en la posición n de un número
	entero. Se empieza contando por el 0 y de izquierda a derecha.*/
	public static long digitoN(long numero, int n) {
		long digito = 0;
		long volteado = voltea(numero);
		
		for (int i=1; ((i<=n) && (volteado>0)); i++) {
			digito = volteado%10;
			volteado /= 10;
		}
		return digito;
	}

	/*8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
	dentro de un número entero. Si no se encuentra, devuelve -1.*/
	public static int posicionDeDigito(long numero, int digito) {
		int numDigitos = digitos(numero);
		int i;
		int posicion = -1;
		for (i=1; i<=numDigitos; i++) {
			if (numero%10 == digito) {
				posicion = i;
			}
			numero /= 10;
		}
		return posicion;
	}

	/*9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
	derecha).*/
	public static long quitaPorDetras(long numero, int digito) {
		for (int i=1; i<=digito; i++) {
			numero /= 10;
		}
		return numero;
	}

	/*10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
	izquierda).*/
	public static long quitaPorDelante(long numero, int digito) {
		long volteado = voltea(numero);

		for (int i=1; i<=digito; i++) {
			volteado /= 10;
			numero = volteado;
		}
		numero = voltea(numero);
		return numero;
	}

	/*11. pegaPorDetras: Añade un dígito a un número por detrás.*/
	public static long pegaPorDetras(long numero, long digito) {
		long numDigitos = digitos(digito);
		long digitos = digitos(numero);

		for (int i=1; i<=digitos; i++) {
			digito *= 10;
		}
		numero += digito;
		return numero;
	}

	/*12. pegaPorDelante: Añade un dígito a un número por delante.*/
	public static long pegaPorDelante(long numero, long digito) {
		int numDigitos = digitos(digito);

		for(int i=1; i<=numDigitos; i++){
			numero *= 10;
		}
		return (numero + digito);
	}		

	/*13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
	dentro de un número y devuelve el trozo correspondiente.*/
	public static long trozoDeNumero(long numero, int inicio, int fin) {
		int longitud = digitos(numero);
		numero = quitaPorDelante(numero, inicio);
		numero = quitaPorDetras(numero, longitud - fin - 1);
		return numero;
	}

	/*14. juntaNumeros: Pega dos números para formar uno.*/
	public static long juntaNumeros(long numeroA, long numeroB) {
		return pegaPorDetras(numeroA, numeroB);
	}
}
