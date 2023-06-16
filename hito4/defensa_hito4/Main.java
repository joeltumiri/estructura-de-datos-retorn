package defensa_hito4;

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente(213132, "Josias","Luis", 36, "Argetina", "Masculino", "GOLD");
        Cliente cli2 = new Cliente(657837, "Daniel", "Mamani", 45, "Argentina", "Masculino", "GOLD");
        Cliente cli3 = new Cliente(242424,"Alejandra", "Monrroy", 19, "Chile", "Femenino", "VIP");
        Cliente cli4 = new Cliente(7567567,"David", "Mamai", 74, "Argentina", "Masculino", "GOLD");
        Cliente cli5 = new Cliente(634645,"Saul", "Saulero", 42, "Rusia", "Masculino", "VIP");

        ColaClientes Cola = new ColaClientes(100);
        Cola.adicionar(cli1);
        Cola.adicionar(cli2);
        Cola.adicionar(cli3);
        Cola.adicionar(cli4);
        Cola.adicionar(cli5);


        //Cola.mostrar();
        //mover("Bolivia", Cola);
        cambiarVuelo(Cola , 213132, 242424);
       }



    // mover al inicio todos los clientes mayores a 60 años
    // es decir si el cliente es mayores a 60 años debera de moverlo al inicio
    // No utilizar while

    public static void mover(String client , ColaClientes cola){
        ColaClientes aux = new ColaClientes(10);
        Cliente Valorextraido = null;
        for (int i = 0; i < cola.nroElem(); i++) {
            aux.adicionar(Valorextraido);
        }
        cola.vaciar(aux);
        cola.mostrar();
    }


    public static void cambiarVuelo(ColaClientes cola, int id1, int id2){
        ColaClientes aux = new ColaClientes(10);
        Cliente Valorextraido = null;
        while (!cola.esVacia()) {
            Valorextraido = cola.eliminar();
            if (Valorextraido.getID() == id1 || Valorextraido.getID() == id2) {
                System.out.println("Cliente con id: " + Valorextraido.getID() + " cambiado de vuelo");
            } else {
                aux.adicionar(Valorextraido);
            }
        }
        cola.vaciar(aux);
        cola.mostrar();
    }
}

