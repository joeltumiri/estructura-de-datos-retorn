package Libros;

public class mainLibro {
    public static void main(String[] args){
        Libro libro1= new Libro("Homero", 500,30.00,"La Odisea", "Historia");
        Libro libro2= new Libro("Homero", 500,40.00,"La Iliada", "Historia");

        PilaDeLibros pila = new PilaDeLibros();

        Libro libro1b= new Libro("Homero", 500,30.00,"La Odisea", "Historia");
        Libro libro2b= new Libro("Homero", 500,50.00,"La Iliada", "Historia");

        PilaDeLibros pilab = new PilaDeLibros();

        pila.adicionar(libro1b);
        pila.adicionar(libro2b);

        pila.adicionar(libro1);
        pila.adicionar(libro2);

        //pila.mostrar();

        //determinarPrecioMayorA25(pila , 25);
        //descuento(pila);
        muestraNumeroMaximo(pilab);
    }
    public static double muestraNumeroMaximo(PilaDeLibros pila) {
        PilaDeLibros aux = new PilaDeLibros();
        Libro libro = null;
        double max = Integer.MIN_VALUE;
        while (!pila.esVacio()) {
            libro = pila.eliminar();
            if (libro.getPresio() > max) {
                max = libro.getPresio();
            }
            aux.adicionar(libro);
        }
        System.out.println("El libro que tiene mayor precio es de: " + max);
        pila.vaciar(aux);
        return max;
    }
    public static void determinarPrecioMayorA25(PilaDeLibros pila, double precio){
        PilaDeLibros aux  = new PilaDeLibros();
        Libro item = null;
        int cont = 0;
        while(!pila.esVacio()){
            item = pila.eliminar();
            if(item.getPresio() > precio){
                cont++;
            }
            aux.adicionar(item);

        }
        pila.vaciar(aux);
        System.out.println("Libros con un valor mayor a "+ precio+"bs = "+cont);
    }
    public static void descuento(PilaDeLibros pila){
        PilaDeLibros aux  = new PilaDeLibros();
        Libro item = null;
        int cont= 0;
        double descuento = 0;
        double newprecio = 0;
        while(!pila.esVacio()){
            item = pila.eliminar();
            if(item.getCategoria().equals("Historia")){
                descuento = item.getPresio()*0.1;
                newprecio = item.getPresio() - descuento;
            }
            aux.adicionar(item);
            cont++;
            System.out.println("El descuento del libro "+cont+" es de :" + newprecio);
        }
        pila.vaciar(aux);

    }
//    public static void intercambiarLibros(PilaDeLibros pila,PilaDeLibros pilab){
//        double max = muestraNumeroMaximo(pila);
//        double max1 = muestraNumeroMaximo(pilab);
//
//        PilaDeLibros aux = new PilaDeLibros();
//        Libro item = null;
//        while(!pila.esVacio()){
//            item = pila.eliminar();
//            Integer.max(item.getPresio());
//                item
//
//            }
//        }
//
//    }
}
