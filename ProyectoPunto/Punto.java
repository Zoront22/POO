public class Punto {
    // atributos
    private int x, y;

    // Constructor por default
    public Punto() {
        x = 0;
        y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // GETERS
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // SETTERS
    public void setX(int nuevoX) {
        x = nuevoX;
    }

    public void setY(int nuevoY) {
        y = nuevoY;
    }

    // METODO DE INSTANCIA
    public double calcularDistancia(int x2, int y2) {
        double distancia, raiz;

        distancia = (Math.pow((x2 - x), 2)) + (Math.pow((y2 - y), 2));
        raiz = Math.sqrt(distancia);

        return raiz;
    }

    public double calcularDistancia2(Punto p) {
        double distancia, raiz;

        distancia = Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2);
        raiz = Math.sqrt(distancia);

        return raiz;
    }

    // METODO TO STRING
    public String toString() {
        String datos = "";
        datos += "(" + x + ", " + y + ")";

        return datos;
    }
}
