import javax.swing.JOptionPane;

public class Prueba {
    public static void main(String[] args) {
        // escriba una aplicacion para la clase instanciable Empleado que haga...:
        // 1. Crear un objeto Empleado e inicializar sus atributos con datos leídos
        // desde
        // cuadros de diálogo.
        // 2. Crear un segundo objeto Empleado
        // 3. Mostrar la información de ambos empleados en cuadros de diálogo.

        int numero;
        String nombre;
        double sueldo;
        Empleado empleado1, empleado2;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del empleado 1:"));
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado 1:");
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del empleado 1:"));

        empleado1 = new Empleado(numero, nombre, sueldo);

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del empleado 2:"));
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado 2:");
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del empleado 2:"));

        empleado2 = new Empleado(numero, nombre, sueldo);

        JOptionPane.showMessageDialog(null, "Información del Empleado 1:\n" + empleado1.toString());
        JOptionPane.showMessageDialog(null, "Información del Empleado 2:\n" + empleado2.toString());

        // Leer el porcentaje(INT) de incremento en los sueldos y aplicarlo a los
        // sueldos de cada empleado.
        // Mostrar nuevamente la información de ambos empleados.

        int porcentaje;
        double nuevoSueldo;

        porcentaje = Integer
                .parseInt(JOptionPane.showInputDialog("Ingrese el porcentaje de incremento en los sueldos:"));

        nuevoSueldo = empleado1.getSueldo() + (empleado1.getSueldo() * porcentaje / 100);
        empleado1.setSueldo(nuevoSueldo);

        nuevoSueldo = empleado2.getSueldo() + (empleado2.getSueldo() * porcentaje / 100);
        empleado2.setSueldo(nuevoSueldo);

        JOptionPane.showMessageDialog(null, "Información actualizada del Empleado 1:\n" + empleado1.toString());
        JOptionPane.showMessageDialog(null, "Información actualizada del Empleado 2:\n" + empleado2.toString());
    }
}