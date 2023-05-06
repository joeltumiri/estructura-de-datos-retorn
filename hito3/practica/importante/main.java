package PilaDeClientes;
public class main {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Carlos", "Marcelo", 20, "Calle 1", "Masculino");
        Clientes cliente2 = new Clientes("Lineth", "Santa", 25, "Calle 2", "Femenino");
        Clientes cliente3 = new Clientes("Otavio", "Suarez", 30, "Calle 3", "Masculino");
        Clientes cliente4 = new Clientes("Ana", "Marta", 35, "Calle 4", "Femenino");
        Clientes cliente5 = new Clientes("Juan", "Gutierrez", 40, "Calle 5", "Masculino");


        pilaCliente pila = new pilaCliente(5);
        pila.insertar(cliente1);
        pila.insertar(cliente2);
        pila.insertar(cliente3);
        pila.insertar(cliente4);
        pila.insertar(cliente5);
    }


    public static void mayoresCiertaEdad(pilaCliente pila, int edadMayor){
        int contador = 0;
        Clientes elem = null;
        if(pila.esvacio()){
            System.out.println("La pila esta vacia");
        } else {
            while(!pila.esvacio()){
                elem = pila.eliminar();
                if(elem.getEdad() > edadMayor){
                    contador++;
                }
            }
        }
        System.out.println("Hay " + contador + " clientes mayores de " + edadMayor + " años");
    }


    public static void moverK_esimo(pilaCliente pila, Clientes k){
        pilaCliente aux = new pilaCliente(10);
        Clientes valorExtraidoPila=null;
        while(!pila.esvacio()){
            valorExtraidoPila = pila.eliminar();
            if(valorExtraidoPila!= k){
                aux.insertar(valorExtraidoPila);
            }
        }
        pila.vaciar(aux);
        pila.insertar(k);
        pila.mostrar();
    }
}
