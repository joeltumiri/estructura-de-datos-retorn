package ejercicio;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        // TODO Auto-generated method stub
        String nameAPP=leer.next();;
        String version=leer.next();;
        int year=leer.nextInt();
        int limite;
        String ci;
        Math_utils mu = new Math_utils(nameAPP,version,year);

        mu.printApp();
        System.out.println();

        limite = leer.nextInt();
        mu.generateNaturalNumber(limite);

        limite = leer.nextInt();
        mu.generatePairNumbers(limite);

        ci = leer.next();
        mu.generateExtensionFromCI(ci);

    }
}
