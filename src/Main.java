import java.util.Scanner;

/**
 * Created by jaime on 09-04-2015.
 */
public class Main {

    public static void main(String[] args) {

        // solicita datos al usuario
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que desea crear: ");
        System.out.print("Cantidad: ");
        int n = Integer.parseInt(scan.nextLine());



        VariableEnlazada variableEnlazada[] = new VariableEnlazada[n];

        // crea variables enlazadas
        for (int i = 0; i <n ; i++) {
            VariableEnlazada varTemp = new VariableEnlazada(i);
            variableEnlazada[i] =varTemp;
        }

        // agrega variables a la lista
        Lista lista = new Lista();

        for (int i = 0; i <n ; i++) {
            lista.add(variableEnlazada[i]);
            System.out.println("Se agrega el valor " + variableEnlazada[i].getNum() +" a la pila");

        }



      // recorre la lista
        lista.recorrer();



    }
}
