package PilasHito3;

public class main {
    public static void main(String[] args) {
        PilaNumeros pila1 = new PilaNumeros();
        pila1.adicionar(10);
        pila1.adicionar(2);
        pila1.adicionar(5);
        pila1.adicionar(23);   //este valor valor deveria mostrarse
        pila1.adicionar(5);

        //    pila1.mostrar();
        //muestraNumeroMaximo(pila1);
        // numeroIgualesA5(pila1);
        // pila1.mostrar();
        // muestraNumeroMaximo(pila1);
        //muestraNumeroMenor(pila1);
        //pila1.mostrar();
        // intercambia_mayor_por_menor(pila1);
        // pila1.mostrar();
        //mostrarNumerosImpares(pila1);
        adicionarNumero(pila1, 100);
        pila1.mostrar();
    }

    public static int muestraNumeroMaximo(PilaNumeros pila) {
        PilaNumeros aux = new PilaNumeros();
        int num = 0;
        int max = 0;
        while (!pila.esVacio()) {
            num = pila.eliminar();
            if (num > max) {
                max = num;
            }
            aux.adicionar(num);
        }
        aux.vaciar(pila);
        System.out.println("MAYOR: " + max);
        return num;
    }
    public static int muestraNumeroMenor(PilaNumeros pila) {
        PilaNumeros aux = new PilaNumeros();
        int num = 0;
        int menor = 0;
        while (!pila.esVacio()) {
            num = pila.eliminar();
            if (num < menor) {
                menor = num;
            }
            aux.adicionar(num);
        }
        aux.vaciar(pila);
        System.out.println("Menor: " + menor);
        return num;
    }
    //determinar cuantos numeros 5 hay en la pila
    //crear un  metodo estatico, similar al anterior
    //el metodo esttico recive 2 paraemtros
    //la pila
    //el numero a buscar en la pila
    public static void numeroIgualesA5(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros();
        int numero = 0;
        while (!pila.esVacio()){
            while(pila.eliminar()==5){
                numero = numero +1;
            }
        }
        System.out.println("Numeros iguales a 5 son =" + numero);
        pila.vaciar(aux);
    }
    public static void intercambia_mayor_por_menor(PilaNumeros pila){
        int max = muestraNumeroMaximo(pila);
        int min = muestraNumeroMenor(pila);
        int item = 0;

        PilaNumeros aux = new PilaNumeros();
        while (!pila.esVacio()){
            item = pila.eliminar();
            if(item == max){
                item = min;
            }else {
                if(item == min){
                    item = max;
                }
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
    }
    public static void mostrarNumerosImpares(PilaNumeros pila){
        int par = 0;
        int impar = 0;
        int item = 0;
        PilaNumeros aux = new PilaNumeros();
        while(!pila.esVacio()){
            item = pila.eliminar();
            if(item%2 == 0){
                par = par +1;
            }
            else{
                impar = impar+1;
            }
        }
        pila.vaciar(aux);
        System.out.println("Numero de pares es: "+ par +"Numero de impares es: "+ impar);

    }
    public static void adicionarNumero(PilaNumeros pila, int item){
        PilaNumeros aux = new PilaNumeros();
        pila.vaciar(aux);
        pila.adicionar(item);
        pila.vaciar(aux);
    }
}


