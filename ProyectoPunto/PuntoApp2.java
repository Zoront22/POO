import javax.swing.JOptionPane;

public class PuntoApp2 {
    public static void main(String[] args) {
        int x, y;
        double distancia1, distancia2, distancia3;
        String salida;
        Punto punto1, punto2, punto3;

        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada x del punto 1:"));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada y del punto 1:"));
        punto1 = new Punto(x, y);

        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada x del punto 2:"));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada y del punto 2:"));
        punto2 = new Punto(x, y);

        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada x del punto 3:"));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada y del punto 3:"));
        punto3 = new Punto(x, y);

        salida = "";
        salida += "\n El punto 1 es: " + punto1.toString();
        salida += "\n El punto 2 es: " + punto2.toString();
        salida += "\n El punto 3 es: " + punto3.toString();

        distancia1 = punto1.calcularDistancia2(punto2);

        salida += "\n La distancia del punto 1 al punto 2 es: ";
        salida += distancia1;

        distancia2 = punto1.calcularDistancia2(punto3);

        salida += "\n La distancia del punto 1 al punto 3 es: ";
        salida += distancia2;

        distancia3 = punto2.calcularDistancia2(punto3);

        salida += "\n La distancia del punto 2 al punto 3 es: ";
        salida += distancia3;

        JOptionPane.showMessageDialog(null, salida);
    }
}
