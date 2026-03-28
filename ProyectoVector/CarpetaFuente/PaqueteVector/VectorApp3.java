package PaqueteVector;

import javax.swing.JOptionPane;

public class VectorApp3 {

	public static void main(String[] args) {
		int n, num, cont, k;
		String r;
		Vector vector1, vector2, interseccion;
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de enteros del vector 1:"));
		vector1 = new Vector(n);
		
		for (int i = 0; i < vector1.getLength(); i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de a[" + i + "]"));
			vector1.setElemento(i, num);
		}
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de enteros del vector 2:"));
		vector2 = new Vector(n);
		
		for (int i = 0; i < vector2.getLength(); i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de b[" + i + "]"));
			vector2.setElemento(i, num);
		}
		
		r = "";
		r += "\n Vector 1 = " + vector1.toString();
		r += "\n Vector 2 = " + vector2.toString();
		
		// sumas
		int j = vector2.getLength() - 1;
		for (int i = 0;i < vector1.getLength(); i++) {
			r += "\n Suma " + (i +1) + " = " + (vector1.getElemento(i) + vector2.getElemento(j));
			j--;
		}
		
		// Contar cuantos enteros son la interseccion
		cont = 0;
		for (int i = 0; i < vector1.getLength(); i++) {
			for (j = 0; j < vector2.getLength(); j++) {
				if (vector1.getElemento(i) == vector2.getElemento(j)) {
					cont ++;
				}
			}
		}
				
		// Almacenar la interseccion en un vector
		if (cont > 0) {
			interseccion = new Vector(cont);
			k = 0;
			
			for (int i = 0; i < vector1.getLength(); i++) {
				for (j = 0; j < vector2.getLength(); j++) {
					if (vector1.getElemento(i) == vector2.getElemento(j)) {
						interseccion.setElemento(k, vector1.getElemento(i));
						k ++;
					}
				}
			}
			
			r += "\n Interseccion = " + interseccion.toString(); 
		} else {
			r += "\n No hay interseccion";
		}
		
		JOptionPane.showMessageDialog(null, r);
	}

}
