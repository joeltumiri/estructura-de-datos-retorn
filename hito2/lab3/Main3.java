package pilas;

public class Main3 {
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] edades = new int[5];
        edades[0] =33;
        edades[1] =19;
        edades[2] =20;
        edades[3] =42;
        edades[4] =25;

        Edades obj1= new Edades("Unifranz","EDD",edades);

        int[] edades1 = new int[5];
        edades1[0] =30;
        edades1[1] =20;
        edades1[2] =19;
        edades1[3] =15;
        edades1[4] =25;

        Edades obj2= new Edades("Unifranz","BDA",edades1);

        obj1.Mostrar();

        System.out.println("\n\n");
        obj2.Mostrar();
        //determinaMayorEdad(obj1);
        //EdadParAdd5(obj1);
        //obj1.Mostrar();
        //IntercambiarValores(obj1,obj2);

        //metodocamingmay(obj1,obj2);

        //metodocamingmin(obj1,obj2);
        valMaxMin(obj1);
        System.out.println("\n\nModificado obj1");
        obj1.Mostrar();
        //System.out.println("\n\nModificado obj2");
        //obj2.Mostrar();




    }


    private static void valMaxMin(Edades obj1)
    {
        // TODO Auto-generated method stub

        int[] edades = obj1.getEdades();

        int max = edades[0];
        int aux = 0, aux1 = 0;
        int pmax = 0;
        int min = edades[0];
        int pmin = 0;

        for(int i=1; i<edades.length ; i++)
        {
            if(edades[i]>max)
            {
                max = edades[i];
                pmax=i;
            }

            if(edades[i]<min)
            {
                min = edades[i];
                pmin = i;
            }
        }

        aux = edades[pmax];
        edades[pmax] = edades[pmin];
        edades[pmin] = aux;

        obj1.setEdades(edades);
    }


    private static void metodocamingmay(Edades obj1, Edades obj2)
    {
        // TODO Auto-generated method stub
        int a = determinaMax(obj1);
        int b = determinaMax(obj2);

        int[] va = obj1.getEdades();

        int[] vb = obj2.getEdades();

        for(int i=0; i<va.length; i++)
        {
            if(va[i]==a)
            {
                va[i]=b;
            }
        }

        for(int i=0; i<vb.length; i++)
        {
            if(vb[i]==b)
            {
                vb[i]=a;
            }
        }

        obj1.setEdades(va);
        obj2.setEdades(vb);


    }

    private static void metodocamingmin(Edades obj1, Edades obj2)
    {
        // TODO Auto-generated method stub
        int a = determinaMin(obj1);
        int b = determinaMin(obj2);

        int[] va = obj1.getEdades();

        int[] vb = obj2.getEdades();

        for(int i=0; i<va.length; i++)
        {
            if(va[i]==a)
            {
                va[i]=b;
            }
        }

        for(int i=0; i<vb.length; i++)
        {
            if(vb[i]==b)
            {
                vb[i]=a;
            }
        }

        obj1.setEdades(va);
        obj2.setEdades(vb);


    }


    private static void IntercambiarValores(Edades obj1, Edades obj2)
    {
        // TODO Auto-generated method stub
        int[] edades = obj1.getEdades();
        int[] edades1 = obj2.getEdades();
        int max = edades[0];
        int aux = 0, aux1 = 0;
        int pmax = 0;
        int min = edades[0];
        int pmin = 0;
        int max1 = edades1[0];
        int pmax1 = 0;
        int min1 = edades1[0];
        int pmin1 = 0;

        for(int i=1; i<edades.length ; i++)
        {
            if(edades[i]>max)
            {
                max = edades[i];
                pmax=i;
            }

            if(edades[i]<min)
            {
                min = edades[i];
                pmin = i;
            }
        }


        for(int i=1; i<edades1.length ; i++)
        {
            if(edades1[i]>max1)
            {
                max1 = edades1[i];
                pmax1=i;
            }

            if(edades1[i]<min1)
            {
                min1 = edades1[i];
                pmin1 = i;
            }
        }


        aux = edades[pmax];
        edades[pmax] = edades1[pmax1];
        edades1[pmax1] = aux;

        aux1 = edades[pmin];
        edades[pmin] = edades1[pmin1];
        edades1[pmin1] = aux1;


        obj1.setEdades(edades);
        obj2.setEdades(edades1);

    }


    //AUMENTAR 5 A LOS NUMEROS PARES
    private static void EdadParAdd5(Edades obj1)
    {
        // TODO Auto-generated method stub
        int[] edades = obj1.getEdades();

        for(int i=0; i<edades.length ; i++)
        {
            if(edades[i]%2==0)
            {
                edades[i]=edades[i]+5;
            }
        }

        obj1.setEdades(edades);

    }


    //DETERMINA EDAD MAYOR
    private static void determinaMayorEdad(Edades obj1)
    {
        // TODO Auto-generated method stub
        int[] edades = obj1.getEdades();
        int mayorDeEdad = edades[0];
        for(int i=1; i<edades.length ; i++)
        {
            if(edades[i]>mayorDeEdad)
            {
                mayorDeEdad = edades[i];
            }
        }

        System.out.println("EDAD MAYOR: "+ mayorDeEdad);
    }


    private static int determinaMax(Edades obj1)
    {
        // TODO Auto-generated method stub
        int[] edades = obj1.getEdades();
        int mayorDeEdad = edades[0];
        for(int i=1; i<edades.length ; i++)
        {
            if(edades[i]>mayorDeEdad)
            {
                mayorDeEdad = edades[i];
            }
        }
        System.out.println("EDAD MAYOR: "+ mayorDeEdad);
        return mayorDeEdad;
    }


    private static int determinaMin(Edades obj1)
    {
        // TODO Auto-generated method stub
        int[] edades = obj1.getEdades();
        int menDeEdad = edades[0];
        for(int i=1; i<edades.length ; i++)
        {
            if(edades[i]<menDeEdad)
            {
                menDeEdad = edades[i];
            }
        }
        System.out.println("EDAD MAYOR: "+ menDeEdad);
        return menDeEdad;
    }
}
