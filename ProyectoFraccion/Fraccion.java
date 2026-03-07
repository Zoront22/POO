public class Fraccion {
    // Atributos
    private int num, den;

    // Constructores
    public Fraccion() {
        num = 0;
        den = 0;
    }

    public Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
    }

    // Metodos
    // Getters
    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    // Setters
    public void setNum(int newNum) {
        num = newNum;
    }

    public void setDen(int newDen) {
        den = newDen;
    }

    // Sumar
    public Fraccion sumarFraccion(Fraccion f) {
        int sumaNum, sumaDen;
        Fraccion resultado;

        sumaNum = (f.getNum() * den) + (f.getDen() * num);
        sumaDen = f.getDen() * den;

        resultado = new Fraccion(sumaNum, sumaDen);

        return resultado;
    }

    // toString
    public String toString() {
        String datos = "";
        datos += num;
        datos += "/";
        datos += den;

        return datos;
    }
}
