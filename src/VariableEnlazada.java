/**
 * Created by jaime on 09-04-2015.
 */
public class VariableEnlazada {

    private int num;
    private VariableEnlazada enlace;

    public VariableEnlazada(int dato) {
        this.num = dato;
        this.enlace = null;
    }

    public VariableEnlazada(int dato, VariableEnlazada variableEnlazada) {
        this.num = dato;
        this.enlace = variableEnlazada;
    }

    public void setEnlace(VariableEnlazada enlace) {
        this.enlace = enlace;
    }

    public VariableEnlazada getEnlace() {
        return this.enlace;
    }


    public int getNum() {
        return this.num;
    }
}

