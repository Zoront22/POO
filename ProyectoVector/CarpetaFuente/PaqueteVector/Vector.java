package PaqueteVector;

public class Vector {
	private int[] a;
	
	// constructor
	public Vector(int n) {
		a = new int[n];
	}
	
	// Getters 
	public int getLength() {
		return a.length;	
	}
	
	public int getElemento(int p) {
		return a[p];
	}
	
	// Setters
	public void setElemento(int p, int valor) {
		a[p] = valor;
	}
	
	// Metodos de instancia
	//	sumar
	public int sumar() {
		int suma = 0;
		
		for (int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		
		return suma;
	}
	
	//	promedio
	public double promedio() {
		double promedio;
		
		
		promedio = (double)sumar() / a.length;
		
		return promedio;
	}
	
	//	mayores que Promedio
	public int mayoresPromedio() {
		int mayor = 0;
		double promedio = promedio();
		
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > promedio) {
				mayor++;
			}
		}
		
		return mayor;
	}
	
	//	suma pares e impares
	public int sumaPares() {
		int sumaPares = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				sumaPares += a[i];
			}
		}
		return sumaPares;
	}
	
	public int sumaImpares() {
		int sumaImpares = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				sumaImpares += a[i];
			}
		}
		return sumaImpares;
	}
	
	//	calc num mayor y menor
	public int numMayor() {
		int numMayor = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > numMayor) {
				numMayor = a[i];
			}
		}
		
		return numMayor;
	}
	
	public int numMenor() {
		int numMenor = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < numMenor) {
				numMenor = a[i];
			}
		}
		
		return numMenor;
	}
	
	//	moda
	public int moda() {
		int moda = a[0];
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
		
		return moda;
	}
	
	//	ordenar vector
	public void ordenarVector() {
		for (int i = 0; i < a.length - 1; i++) {
			boolean intercambio = false;
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
	}
	
	// Metodo ToString
	public String toString() {
		String salida = "";
		
		salida += "{" + a[0];
		
		// mostrar datos del arreglo
		for (int i = 1; i < a.length; i++) {
			salida += "," + a[i];
		}
		
		salida += "}";
		
		return salida;
	}
}
