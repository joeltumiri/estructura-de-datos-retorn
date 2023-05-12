package refor;

public class Estudiante {
    private String nombres;
    private String apellido;
    private int edad;
    private String sede;
    private int notaFinal;
    private String ci;

    public Estudiante(String nombres, String apellido, int edad, String sede, int notaFinal, String ci) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.edad = edad;
        this.sede = sede;
        this.notaFinal = notaFinal;
        this.ci = ci;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getSede() {
        return sede;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public String getCi() {
        return ci;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void mostrarEstudiante()
    {
        System.out.println("Nombres: " + this.nombres);
        System.out.println("Apellidos: " + this.apellido);
        System.out.println("Edad: " + this.edad);
        System.out.println("Sede: " + this.sede);
        System.out.println("Nota Final: " + this.notaFinal);
        System.out.println("CI: " + this.ci);
    }
}
