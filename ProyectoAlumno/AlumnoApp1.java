import javax.swing.JOptionPane;

public class AlumnoApp1 {
        public static void main(String[] args) {
                // variables
                int numControl;
                String nomAlumno;
                int cal1, cal2, cal3;
                double promedioGrupo;
                Alumno alumno1, alumno2;

                numControl = Integer.parseInt(
                                JOptionPane.showInputDialog(null, "Ingrese el numero de control del alumno 1:"));
                nomAlumno = JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno 1:");
                cal1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la calificacion 1 del alumno 1:"));
                cal2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la calificacion 2 del alumno 1:"));
                cal3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la calificacion 3 del alumno 1:"));

                alumno1 = new Alumno();

                alumno1.setNumControl(numControl);
                alumno1.setNomAlumno(nomAlumno);
                alumno1.setCal1(cal1);
                alumno1.setCal2(cal2);
                alumno1.setCal3(cal3);

                numControl = Integer.parseInt(
                                JOptionPane.showInputDialog(null, "Ingrese el numero de control del alumno 2:"));
                nomAlumno = JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno 2:");
                cal1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la calificacion 1 del alumno 2:"));
                cal2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la calificacion 2 del alumno 2:"));
                cal3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la calificacion 3 del alumno 2:"));

                alumno2 = new Alumno();

                alumno2.setNumControl(numControl);
                alumno2.setNomAlumno(nomAlumno);
                alumno2.setCal1(cal1);
                alumno2.setCal2(cal2);
                alumno2.setCal3(cal3);

                alumno1.calcularPromedio();
                alumno2.calcularPromedio();

                promedioGrupo = alumno1.getPromedio() + alumno2.getPromedio() / 2;

                JOptionPane.showMessageDialog(null,
                                "Datos del alumno 1" + alumno1.toString() + "\n Datos del alumno 2" + alumno2.toString()
                                                + "\n Promedio grupal: " + promedioGrupo);

                cal2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Actualice la calificacion 2 del alumno 1:"));
                alumno1.setCal2(cal2);

                cal2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Actualice la calificacion 2 del alumno 2:"));
                alumno2.setCal2(cal2);

                alumno1.calcularPromedio();
                alumno2.calcularPromedio();

                promedioGrupo = (alumno1.getPromedio() + alumno2.getPromedio()) / 2;

                JOptionPane.showMessageDialog(null,
                                "Datos del alumno 1" + alumno1.toString() + "\n Datos del alumno 2" + alumno2.toString()
                                                + "\n Promedio grupal: " + promedioGrupo);
        }
}
