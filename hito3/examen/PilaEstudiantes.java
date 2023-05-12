package refor;

public class PilaEstudiantes {
    private int max;
    private int tope;
    private Estudiante[] estudiantes;

    public PilaEstudiantes(int max)
    {
        this.tope = 0;
        this.max = max;
        this.estudiantes = new Estudiante[this.max +1];
    }

    public boolean esVacio()
    {
        if(this.tope == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean esllena()
    {
        if(tope == max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int nroElementos()
    {
        return this.tope;
    }

    public void adicionar(Estudiante nuevoEstudiante)
    {
        if (!this.esllena())
        {
            this.tope = this.tope +1;
            this.estudiantes[this.tope] = nuevoEstudiante;

        }
        else
        {
            System.out.println("La pila de estudiantes esta llena: ");
        }

    }

    public Estudiante eliminar()
    {
        Estudiante estudianteEliminado = null;
        if(!this.esVacio())
        {
            estudianteEliminado = this.estudiantes[this.tope];
            this.tope = this.tope -1;
        }
        else
        {
            System.out.println("La pila de estudiantes esta vacia: ");
        }
        return estudianteEliminado;
    }

    public void llenar(){}

    public void mostrar(){
        Estudiante elem=null;
        if(this.esVacio()){
            System.out.println("La pila de estudiantes esta vacia: ");
        }else{
            System.out.println("Mostar los elementos de la pila de estudiantes ");
            PilaEstudiantes aux = new PilaEstudiantes(this.max);
            while(!this.esVacio()){
                elem = this.eliminar();
                aux.adicionar(elem);
                elem.mostrarEstudiante();
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaEstudiantes a){
        while(!a.esVacio()){
            this.adicionar(a.eliminar());
        }
    }

}
