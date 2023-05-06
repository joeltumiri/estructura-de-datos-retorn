package PilaCadenas;

public class main {
    public static void main(String[] args){
        PilaDeCadenas nombresEDD = new PilaDeCadenas();
        nombresEDD.adicionar("WILLIAM");
        nombresEDD.adicionar("ANDRES");
        nombresEDD.adicionar("JOSIAS");
        nombresEDD.adicionar("IRIS");
        nombresEDD.adicionar("JHONATAN");
        nombresEDD.adicionar("ILLIA");
        //nombresEDD.mostrar();
        //nombresEDD.llenar(6);
        //cuentaAndres(nombresEDD);
        //intercambioItems(nombresEDD);
        kesimoPosition(nombresEDD, 3);
        nombresEDD.mostrar();

    }
    public static void cuentaAndres(PilaDeCadenas pila){
        PilaDeCadenas aux = new PilaDeCadenas();
        int numero =0;
        while(!pila.esVacio()){
            while(pila.eliminar()=="ANDRES"){
                numero++;
            }
        }
        System.out.println("HAY: " +numero + " NOMBRES IGUALES A ANDRES");
        pila.vaciar(aux);
    }
    public static void agregarNombre(PilaDeCadenas pila, String nombre, String nuevoNombre){
        PilaDeCadenas aux = new PilaDeCadenas();
        String itemEliminado = "";
        while(!pila.esVacio()){
            itemEliminado = pila.eliminar();
            if(itemEliminado.equals(nombre)){
                aux.adicionar(nuevoNombre);
            }
            aux.adicionar(itemEliminado);
        }

    }
    public static void intercambioItems(PilaDeCadenas pila){
        PilaDeCadenas aux =new PilaDeCadenas();
        String item1 = pila.eliminar();
        aux.vaciar(pila);
        String item2 = aux.eliminar();
        pila.adicionar(item1);
        pila.vaciar(aux);
        pila.adicionar(item2);
    }
    public static void kesimoPosition(PilaDeCadenas pila, int kesimo){
        PilaDeCadenas aux = new PilaDeCadenas();
        String nombreKesimo = "";
        String itemEliminado = "";
        while(!pila.esVacio()){
            itemEliminado = pila.eliminar();
            if (pila.nroElementos() == kesimo){
                nombreKesimo = itemEliminado;
            }else {
                aux.adicionar(itemEliminado);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(nombreKesimo);
    }
}
