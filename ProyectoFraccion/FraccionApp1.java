import javax.swing.JOptionPane;

public class FraccionApp1 {
    public static void main(String[] args) {
        int num, den;
        Fraccion fraccion1, fraccion2;
        String salida;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numerador de la fraccion 1:"));
        den = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el denominador de la fraccion 1:"));

        fraccion1 = new Fraccion(num, den);

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numerador de la fraccion 2:"));
        den = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el denominador de la fraccion 2:"));

        fraccion2 = new Fraccion(num, den);

        salida = "";
        salida += fraccion1.toString() + " + " + fraccion2.toString();
        salida += " = ";
        salida += fraccion1.sumarFraccion(fraccion2);

        JOptionPane.showMessageDialog(null, salida);
    }
}
