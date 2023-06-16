package ColaDeClientes;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Cristian", "Achu", 20, "Brasil", "Masculino", "Silver");
        Cliente c2 = new Cliente("Dania", "Mamani", 30, "Chile", "Femenino", "Gold");
        Cliente c3 = new Cliente("Marcos", "Castaneda", 80, "Mexico", "Masculino", "Vip");
        Cliente c4 = new Cliente("Daniel", "Rivaldo", 60, "Paraguay", "Masculino", "Silver");
        Cliente c5 = new Cliente("Ana", "Guzman", 65, "Bolivia", "Femenino", "Gold");


        ColaClientes colaCli = new ColaClientes(100);
        colaCli.adicionar(c1);
        colaCli.adicionar(c2);
        colaCli.adicionar(c3);
        colaCli.adicionar(c4);
        colaCli.adicionar(c5);

        //colaCli.mostrar();
        //cambiarTipo(colaCli, "Bolivia", "Gold","Vip");
        MoverClientesMayores(colaCli, 60);
        }


        // En el mes de diciembre a todos los clientes de Bolivia se les dará una promoción
        // en cuanto a precios en viajes a nivel nacional.
        // A todos los clientes que sean de nacionalidad boliviana y además el tipo
        // de cliente GOLD, convertir a estos clientes en VIP
        // Es decir si es de Bolivia y es GOLD deberá ser ahora un cliente VIP
        // El método estático dentro de la clase MAIN recibe 3 atributos
        // La cola de clientes
        // El tipo de cliente
        // La nacionalidad del cliente
    public static void cambiarTipo(ColaClientes Cola, String Pais, String tipo,String NewTipo) {
        ColaClientes aux = new ColaClientes(10);
        Cliente Valorextraido = null;
        while (!Cola.esVacia()) {
            Valorextraido = Cola.eliminar();
            if (Valorextraido.getPais().equals(Pais) && Valorextraido.getTipo().equals(tipo)) {
                Valorextraido.setTipo(NewTipo);
                aux.adicionar(Valorextraido);
            }
            aux.adicionar(Valorextraido);
        }
        Cola.vaciar(aux);
        Cola.mostrar();
    }

    //Determinar cuantos clientes son mayores a 60 años
    //Mover al inicio todos los clientes mayores a 60 años.
    //Es decir si el cliente es mayor a 60 deberá de moverlo al inicio de la cola.
    //El método recibe 2 parámetros
    //La Cola de Clientes
    //El valor(int) de la edad
    public static void MoverClientesMayores(ColaClientes cola, int edadMayor) {
        ColaClientes aux = new ColaClientes(100);
        ColaClientes aux2 = new ColaClientes(100);
        Cliente Valorextraido = null;
        while (!cola.esVacia()) {
            Valorextraido = cola.eliminar();
            if (Valorextraido.getEdad() >= edadMayor) {
                aux2.adicionar(Valorextraido);
            }
            aux.adicionar(Valorextraido);
        }
        cola.vaciar(aux2);
        cola.vaciar(aux);
        cola.mostrar();
    }

    //Moviendo clientes entre 2 colas.
    //Por razones de promociones de vuelo, es necesario cambiar de vuelo a ciertos clientes.
    //Crear 2 colas con 5 clientes.
    //Todos los clientes cuyo nombre sea Saul deberán ser agregados a la
    //cola B al inicio


}
