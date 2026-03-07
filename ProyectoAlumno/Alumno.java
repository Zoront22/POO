public class Alumno {
    private int numControl;
    private String nomAlumno;
    private int cal1, cal2, cal3;
    private double promedio;

    // constructor por default
    public Alumno() {
        this.numControl = 0;
        this.nomAlumno = "";
        this.cal1 = 0;
        this.cal2 = 0;
        this.cal3 = 0;
        this.promedio = 0.0;
    }

    // constructor con parametros
    /*
     * public Alumno(int numControl, String nomAlumno, int cal1, int cal2, int cal3,
     * double promedio) {
     * this.numControl = numControl;
     * this.nomAlumno = nomAlumno;
     * this.cal1 = cal1;
     * this.cal2 = cal2;
     * this.cal3 = cal3;
     * this.promedio = promedio;
     * }
     */

    // Getters
    public int getNumControl() {
        return numControl;
    }

    public String getNomAlumno() {
        return nomAlumno;
    }

    public int getCal1() {
        return cal1;
    }

    public int getCal2() {
        return cal2;
    }

    public int getCal3() {
        return cal3;
    }

    public double getPromedio() {
        return promedio;
    }

    // Setters
    public void setNumControl(int nuevoNumControl) {
        numControl = nuevoNumControl;
    }

    public void setNomAlumno(String nuevoNomAlumno) {
        nomAlumno = nuevoNomAlumno;
    }

    public void setCal1(int nuevoCal1) {
        cal1 = nuevoCal1;
    }

    public void setCal2(int nuevoCal2) {
        cal2 = nuevoCal2;
    }

    public void setCal3(int nuevoCal3) {
        cal3 = nuevoCal3;
    }

    public void setPromedio(double nuevoPromedio) {
        promedio = nuevoPromedio;
    }

    // toString
    public String toString() {
        String datos = "";
        datos += "\n Numero de control: " + numControl;
        datos += "\n Nombre del alumno: " + nomAlumno;
        datos += "\n Calificacion 1: " + cal1;
        datos += "\n Calificacion 2: " + cal2;
        datos += "\n Calificacion 3: " + cal3;
        datos += "\n Promedio: " + promedio;

        return datos;
    }

    // calcular promedio
    public double calcularPromedio() {
        promedio = (cal1 + cal2 + cal3) / 3.0;

        return promedio;
    }
}
