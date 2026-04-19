package PaqueteVector;

import javax.swing.JOptionPane;

public class VectorApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, num;
		String r;
		Vector vector1;
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño del array:"));
		
		vector1 = new Vector(n);
		
		for (int i = 0; i < vector1.getLength(); i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de a[" + (i + 1) + "]:"));
			vector1.setElemento(i, num);
		}
		/*
		ultimo = vector1.getElemento(n-1);
		primero = vector1.getElemento(0);*/
		
		r = " ";
		r += "Vector original = ";
		r += vector1.toString();
		
		// corrimiento a la derecha
		/*for (int i = n - 1; i > 0; i--) {
			valor = vector1.getElemento(i - 1);
			vector1.setElemento(i, valor);
		}
		
		vector1.setElemento(0, ultimo);*/
		
		vector1.corrimientosDerecha();
		r += "\n Vector con corrimiento a la derecha = ";
		r += vector1.toString();
		
		// Corrimiento a la izquierda
		/*for (int i = 0; i < n-1; i++) {
			valor = vector1.getElemento(i+1);
			vector1.setElemento(i, valor);
		}
		// vector1.setElemento(n-1, primero);
		
		for (int i = 0; i < n - 1; i++) {
			valor = vector1.getElemento(i + 1);
			vector1.setElemento(i, valor);
		}
		vector1.setElemento(n-1, primero);
		*/
		vector1.corrimientosIzquierda();
		vector1.corrimientosIzquierda();
		r += "\n Vector con corrimiento a la izquierda = ";
		r += vector1.toString();
		
		JOptionPane.showMessageDialog(null, r);
	}

}
