package ejercicio;

public class Ejercicios
{
    private int i;
    private int limite;

    public Ejercicios()
    {
        this.i = 1;
        this.limite = 10;
    }

    public void mostrarMensaje()
    {
        System.out.println("hola mundo desde Java");
    }

    public void generarNumerosNaturales()
    {
        for (int i = 0; i <=10; i++)
        {
            System.out.println("i = " + i);
        }
    }

    public void generarNaturalesFOR()
    {
        for (int i = 2; i <= 20; i=i+2)
        {
            System.out.println(i + ", ");
        }
    }

    public void generarNaturalesParesFOR()
    {
        for (int i = 2; i <= 20; i=i+2)
        {
            System.out.println(i + ", ");
        }
    }

    public void generarNaturalesWHILE()
    {
        int i = 1;

        while ( i <= 5)
        {
            System.out.println(i + ", ");
            i = i + 1;
            //i++;
            //i+=i
        }
    }


    public class Math_utils
    {

    }

}
