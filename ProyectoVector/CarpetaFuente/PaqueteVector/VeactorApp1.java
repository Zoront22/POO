package PaqueteVector;

import javax.swing.JOptionPane;

public class VeactorApp1 {
	public static void main(String args[]) {
		int n, suma, mayor, sumaPares, sumaImpares, numMayor, numMenor, moda;
		int[] a;
		double promedio;
		String salida;
		boolean intercambio;
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique cuantos numero va a ingresar"));
		
		a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero " + (i+1)));
		}
		
		// suma
		suma = 0;
		
		for (int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		
		// promedio
		promedio = (double)suma / (double)n;
		
		// cuantos numeros son mayores que el promedio
		mayor = 0;
		
		// suma posiciones pares e impares
		sumaPares = 0;
		sumaImpares = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				sumaPares += a[i];
			} else {
				sumaImpares += a[i];
			}
		}
				
		for (int i = 0; i < a.length; i++) {
			if (a[i] > promedio) {
				mayor++;
			}
		}
		
		// Calcular el entero mayor
		numMayor = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > numMayor) {
				numMayor = a[i];
			}
		}
		
		// Calcular el entero menor
		numMenor = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < numMenor) {
				numMenor = a[i];
			}
		}
		// calcular moda
		moda = a[0];
		int cont1 = 0;
		for (int i = 1; i < a.length; i++) {
			int cont2 = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					cont2++;
				}
			}
			if (cont2 > cont1) {
				moda = a[i];
				cont1 = cont2;
			}
		}
		
		salida = "";
		salida += "\n Vector a = {" + a[0];
		
		// mostrar datos del arreglo
		for (int i = 1; i < a.length; i++) {
			salida += "," + a[i];
		}
		
		salida += "}";
		
		// vector ordenado
		for (int i = 0; i < a.length - 1; i++) {
			intercambio = false;
			for (int j = 0; j < a.length -1 -i; j++) {
				if (a[j] > a[j+1]) {
					int x = a[j];
					a[j] = a[j +1];
					a[j +1] = x;
					intercambio = true;
				}
			}
			if (!intercambio) {
				break;
			}
		}
		
		salida += "\n Vector ordenado = a = {" + a[0];
		for (int i = 1; i < a.length; i++) {
			salida += "," + a[i];
		}
		
		salida += "}";
		salida += "\n Suma = " + suma;
		salida += "\n Promedio = " + promedio;
		salida += "\n Mayores al promedio = " + mayor;
		salida += "\n Suma de posiciones pares = " + sumaPares;
		salida += "\n Suma de posiciones impares = " + sumaImpares;
		salida += "\n El numero mayor es = " + numMayor;
		salida += "\n El numero menor es = " + numMenor;
		salida+= "\n La moda es = " + moda;
		
		JOptionPane.showMessageDialog(null, salida);
	}
}
