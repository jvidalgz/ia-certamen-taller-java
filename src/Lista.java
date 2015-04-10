/**
 * Created by jaime on 09-04-2015.
 */
public class Lista {

    private VariableEnlazada primero;
    private VariableEnlazada ultimo;
    private int tope;
    private int total=0;

    public int getTotal() {
        return total;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public Lista() {
        ultimo = null;

    }


    public void add(VariableEnlazada nuevo) {

        if (ultimo == null) {
            this.primero = nuevo;
            this.ultimo = nuevo;
            total++;
        } else {
            ultimo.setEnlace(nuevo);
            ultimo = nuevo;
            total++;
        }
    }

    public void recorrer() {
        int i = 0;
        System.out.println("La lista tiene los siguientes Valores: ");
        while (i < total) {
            System.out.println(primero.getNum());
            primero = primero.getEnlace();
            i++;
        }
    }
}
