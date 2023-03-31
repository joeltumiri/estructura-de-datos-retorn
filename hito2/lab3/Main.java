package pilas;

public class Main {
    public static void main(String[] args)
    {
        int [] edades = new int[5];
        edades[0] =33;
        edades[1] =20;
        edades[2] =19;
        edades[3] =42;
        edades[4] =25;
        Edades obj1 = new Edades("Unifranz", "B", edades);
        obj1.mostrar();

    }

    //determinar la edad
    public static void determinaEdadMayor(Edades obj1)
    {
        int[] edades = obj1.getEdades();
        int mayorEdad = edades[0];

        for (int i = 1; i < edades.length; i++)
        {
            if (edades[i] > mayorEdad)
            {
                mayorEdad = edades[i];
            }

        }
        System.out.println("Edad Mayor: " + mayorEdad);
    }

    public static void numerosPares(Edades obj1)
    {
        int [] edades = obj1.getEdades();
        for (int i = 1; i <= edades.length; i=i+2)
        {
            if(edades[i] % 2 == 0)
            {
             edades[i] = edades[i] + 5;
            }
        }
        obj1.setEdades(edades);
    }


}



