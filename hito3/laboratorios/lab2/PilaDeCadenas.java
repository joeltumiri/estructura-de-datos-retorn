package PilaCadenas;

import java.util.Scanner;

public class PilaDeCadenas {
    private int max;
    private int tope;
    private String[] cadenas;

    public PilaDeCadenas() {
        this.max = 10;
        this.tope=0;
        this.cadenas=new String[this.max +1];
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
    public void adicionar(String nuevoNombre){
        if(esLlena()){
            System.out.println("Pila llena; "+ this.tope);
        }
        else{
            tope= tope +1;
            cadenas[tope] = nuevoNombre;
        }
    }
    public String eliminar(){
        String itemEliminado="";

        if (esVacio() == true){
            System.out.println("Pila Vacia: "+ this.tope);
        }
        else{
            itemEliminado = cadenas[this.tope];
            tope = tope-1;
        }
        return itemEliminado;
    }
    public void vaciar(PilaDeCadenas pila){
        while (!pila.esVacio()){
            adicionar(pila.eliminar());
        }
    }

    public void mostrar() {
        String item ="";
        if(esVacio()==true){
            System.out.println("NO HAY ITEMS QUE MOSTRAR: ");
        } else{
            System.out.println("MOSTRANDO PILA DE NUMEROS: ");
            PilaDeCadenas aux =new PilaDeCadenas();
            while (esVacio()==false){
                item = eliminar();
                System.out.println("Elemento: "+ item);
                aux.adicionar(item);
            }
            vaciar(aux);
            System.out.println("");
            System.out.println("TOPE= "+ this.tope);
        }
    }
    public void llenar(int nroItems){
        Scanner leer = new Scanner(System.in);
        String nombre = "";

        System.out.println("Llenando la pila de nombres(Cadenas). ");
        for(int i =1;i<=nroItems;i++){
            System.out.println("Ingrese el nombre: "+ (i+i)+":");
            nombre = leer.nextLine();
            adicionar(nombre);
            System.out.println("");
        }

    }
}
