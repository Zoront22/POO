import javax.swing.JOptionPane;

public class PuntoApp1 {
    public static void main(String[] args) {
        int x, y;
        double distancia;
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

        distancia = punto1.calcularDistancia(punto2.getX(), punto2.getY());

        salida = "";
        salida += "\n El punto 1 es: " + punto1.toString();
        salida += "\n El punto 2 es: " + punto2.toString();
        salida += "\n El punto 3 es: " + punto3.toString();

        salida += "\n La distancia del punto 1 al punto 2 es: ";
        salida += distancia;

        distancia = punto1.calcularDistancia(punto3.getX(), punto3.getY());

        salida += "\n La distancia del punto 1 al punto 3 es: ";
        salida += distancia;

        distancia = punto2.calcularDistancia(punto3.getX(), punto3.getY());

        salida += "\n La distancia del punto 2 al punto 3 es: ";
        salida += distancia;

        JOptionPane.showMessageDialog(null, salida);
    }
}
