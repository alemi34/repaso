package EjemploCajaNegra;

import java.util.Scanner;

import org.junit.platform.commons.util.StringUtils;

/**
 * Código de ejemplo de caja negra
 * 
 * @author dam108
 * @version 1.0
 */
public class EjemploCajaNegra {
/**
 * 
 * @hidden
 */
	public static void main(String[] args) {
		EjemploCajaNegra miPrograma = new EjemploCajaNegra();
		miPrograma.AmigosDivisores();
	}

	public void AmigosDivisores() {
		boolean letras;
		String numero1, numero2;
		Scanner miScan = new Scanner(System.in);
		System.out.println("�Quiere saber si son amigos o divisores?: ");
		String operacion = miScan.nextLine();
		if (operacion.contentEquals("amigos") || operacion.contentEquals("divisores")) {
			System.out.println("Introduce un numero par y positivo");
			numero1 = miScan.nextLine();
			try {
				Integer.parseInt(numero1);
				letras = false;
			} catch (NumberFormatException e) {
				letras = true;
			}
			if (letras) {
				System.out.println("Ha insertado letras en la indicaci�n del primer n�mero. Cerramos el programa");
			} else {
				if ((Integer.parseInt(numero1) % 2 == 0) && (Integer.parseInt(numero1) > 0)) {
					System.out.println("Introduce un numero entre 3000 y 4999");
					numero2 = miScan.nextLine();
					try {
						Integer.parseInt(numero2);
						letras = false;
					} catch (NumberFormatException e) {
						letras = true;
					}
					if (letras) {
						System.out.println(
								"Ha insertado letras en la indicaci�n del segundo n�mero. Cerramos el programa");
					} else {
						if ((Integer.parseInt(numero2) > 2999) && (Integer.parseInt(numero2) < 5000)) {
							int contadorNumero1 = 0, contadorNumero2 = 0;
							if (operacion.contentEquals("amigos")) {
								for (int i = 2; i < (Integer.parseInt(numero1)); i++) {
									if (Integer.parseInt(numero1) % i == 0) {
										contadorNumero1++;
									}
								}
								for (int j = 2; j < (Integer.parseInt(numero2)); j++) {
									if (Integer.parseInt(numero2) % j == 0) {
										contadorNumero2++;
									}
								}
								if (contadorNumero1 == contadorNumero2) {
									System.out.println("Los numeros introducidos son amigos");
								} else {
									System.out.println("Los numeros introducidos no son amigos");
								}
							} else {
								System.out.print("Los divisores del primer numero son: ");
								for (int i = 2; i < (Integer.parseInt(numero1)); i++) {
									if (Integer.parseInt(numero1) % i == 0) {
										System.out.print(i + ",");
									}
								}
								System.out.print("\nLos divisores del segundo numero son: ");
								for (int i = 2; i < (Integer.parseInt(numero2)); i++) {
									if (Integer.parseInt(numero2) % i == 0) {
										System.out.print(i + ",");
									}
								}
							}
						} else {
							System.out.println("El segundo n�mero no est� entre 3000 y 5000. Cerramos el programa");
						}
					}
				} else {
					System.out.println("El primer numero no es par y positivo. Cerramos el programa");
				}
			}
		} else {
			System.out.println("Lo siento, no se ha indicado la operacion adecuada. Cerramos el programa");
		}
	}
}