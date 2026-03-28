package PaqueteVector;
import javax.swing.JOptionPane;

public class VectorApp2 {

	public static void main(String[] args) {
		int n, num;
		String r;
		Vector vector1;
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño del vector:"));
		vector1 = new Vector(n);
		
		// leer n enteros
		for (int i = 0; i < vector1.getLength(); i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de a[" + i + "]"));
			vector1.setElemento(i, num);
		}
		
		r = "";
		r += "\n Vector original: " + vector1.toString();
		vector1.ordenarVector();
		r += "\n Vector ordenado: " + vector1.toString();
		r += "\n Suma de los elementos: " + vector1.sumar();
		r += "\n Suma de los elementos pares: " + vector1.sumaPares();
		r += "\n Suma de los elementos impares: " + vector1.sumaImpares();
		r += "\n Promedio: " + vector1.promedio();
		r += "\n Mayores que el promedio: " + vector1.mayoresPromedio();
		r += "\n Numero mayor: " + vector1.numMayor();
		r += "\n Numero menor: " + vector1.numMenor();
		r += "\n Moda: " + vector1.moda();
		
		JOptionPane.showMessageDialog(null, r);
	}

}
