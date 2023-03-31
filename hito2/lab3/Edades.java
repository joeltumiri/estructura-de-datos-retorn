package pilas;

public class Edades
{
    private String Universidad;

    private String Paralelo;

    private int[] Edades ;


    public Edades (String Universidad, String Paralelo, int[] Edades )  //constructor
    {
        this.Universidad = Universidad;
        this.Paralelo = Paralelo;
        this.Edades = Edades;
    }

    public String getUniversidad() { //retornando valor

        return Universidad;
    }

    public String getParalelo() {

        return Paralelo;
    }

    public int[] getEdades() {
        return Edades;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public void setParalelo(String paralelo) {
        this.Paralelo = Paralelo;
    }

    public void setEdades(int[] edades) {
        Edades = edades;
    }

    public void mostrar() {
        System.out.println("Mostrar Clase EDAD");
        System.out.println("universidad = " + this.getUniversidad());
        System.out.println("paralelo = " + this.getParalelo());


        for (int i=0; i < this.getEdades().length; i++)  //for (int i=0; i < 5; i++)
        {
            System.out.print(this.Edades[i] + ", ");
        }
        System.out.println();


    }

}
