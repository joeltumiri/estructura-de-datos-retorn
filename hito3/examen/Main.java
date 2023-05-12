package refor;

public class Main {
    public static void main(String[] args) {
        PilaEstudiantes pila = new PilaEstudiantes(5);
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", 24, "Cochabamba", 15, "123456");
        Estudiante estudiante2 = new Estudiante("Maria", "Gomez", 23, "Cochabamba", 15, "123456");
        Estudiante estudiante3 = new Estudiante("Pedro", "Perez", 22, "Cochabamba", 15, "123456");
        Estudiante estudiante4 = new Estudiante("Luis", "Perez", 21, "Cochabamba", 51, "123456");
        Estudiante estudiante5 = new Estudiante("Ana", "Perez", 51, "Cochabamba", 15, "123456");

        pila.adicionar(estudiante1);
        pila.adicionar(estudiante2);
        pila.adicionar(estudiante3);
        pila.adicionar(estudiante4);
        pila.adicionar(estudiante5);
    }



}
