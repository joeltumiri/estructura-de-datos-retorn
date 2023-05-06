package Libros;

public class PilaDeLibros {
    private int max;
    private int tope;
    private Libro[] libros;

    public PilaDeLibros() {
        this.max = 10;
        this.tope=0;
        this.libros=new Libro[this.max +1];
    }
    public boolean esVacio(){
        if(this.tope==0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean esLlena(){
        if(this.tope == this.max){
            return true;
        }
        else{
            return false;
        }
    }
    public int nroElementos(){
        return this.tope;
    }
    //Adisionar nuevo numero
    public void adicionar(Libro nuevoLibro){
        if(esLlena()){
            System.out.println("Pila llena; "+ this.tope);
        }
        else{
            tope= tope +1;
            this.libros[tope] = nuevoLibro;
        }
    }
    public Libro eliminar(){
        Libro libroEliminado =  null;

        if (esVacio() == true){
            System.out.println("Pila Vacia: "+ this.tope);
        }
        else{
            libroEliminado = libros[this.tope];
            tope = tope-1;
        }
        return libroEliminado;
    }
    public void vaciar(PilaDeLibros pila){
        while (!pila.esVacio()){
            adicionar(pila.eliminar());
        }
    }

    public void mostrar() {
        Libro libro = null;
        if(esVacio()==true){
            System.out.println("NO HAY ITEMS QUE MOSTRAR: ");
        } else{
            System.out.println("MOSTRANDO PILA DE LIBROS: ");
            PilaDeLibros aux =new PilaDeLibros();
            while (esVacio()==false){
                libro = eliminar();
                libro.mostrar();
                aux.adicionar(libro);
            }
            vaciar(aux);
            System.out.println("");

        }
    }
//    public void llenar(int nroItems){
//        Scanner leer = new Scanner(System.in);
//        String nombre = "";
//
//        System.out.println("Llenando la pila de nombres(Cadenas). ");
//        for(int i =1;i<=nroItems;i++){
//            System.out.println("Ingrese el nombre: "+ (i+i)+":");
//            nombre = leer.nextLine();
//            adicionar(nombre);
//            System.out.println("");
//        }
//
//    }
}
