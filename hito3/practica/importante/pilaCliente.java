package PilaDeClientes;

public class pilaCliente {
    private int tope;
    private int max;
    private Clientes[] pila1;

    public pilaCliente(int max) {
        this.max = max;
        this.tope = 0;
        this.pila1 = new Clientes[this.max+1];
    }

    public boolean esvacio(){
        if(tope == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean eslleno(){
        if(tope == max){
            return true;
        }else{
            return false;
        }
    }

    public int nroElementos(){
        return this.tope;
    }

    public void insertar(Clientes nuevoCliente){
        if(!eslleno()){
            tope++;
            this.pila1[tope] = nuevoCliente;
        }else{
            System.out.println("La pila esta llena");
        }
    }

    public Clientes eliminar() {
        Clientes elementoEliminado = null;
        if (!esvacio()) {
            elementoEliminado = this.pila1[tope];
            tope--;
        } else {
            System.out.println("La pila esta vacia");
        }
        return elementoEliminado;
    }

    public void llenar(){}

    public void mostrar(){
        Clientes elem=null;
        if(esvacio()){
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Elementos de la pila");
            pilaCliente aux = new pilaCliente(this.max);
            while(!esvacio()){
                elem = this.eliminar();
                aux.insertar(elem);
                elem.mostrarDatos();
            }
            vaciar(aux);
        }
    }

    public void vaciar(pilaCliente a){
        while (!a.esvacio()) {
            insertar(a.eliminar());
        }
    }

}
