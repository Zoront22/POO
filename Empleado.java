public class Empleado {
    // atributos
    private int numEmp;
    private String nomEmp;
    private double sueldo;

    // Constructores
    public Empleado() {
        this.numEmp = 0;
        this.nomEmp = "";
        this.sueldo = 0.0;
    }

    public Empleado(int numEmp, String nomEmp, double sueldo) {
        this.numEmp = numEmp;
        this.nomEmp = nomEmp;
        this.sueldo = sueldo;
    }

    // metodos
    public int getNumEmp() {
        return numEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString() {
        return "Número de Empleado: " + numEmp + "\n" +
                "Nombre del Empleado: " + nomEmp + "\n" +
                "Sueldo: $" + sueldo;
    }
}
