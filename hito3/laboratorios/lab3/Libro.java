package Libros;

public class Libro {
    private String autor;
    private int nroPag;
    private double presio;
    private String titulo;
    private String categoria;

    public Libro(String autor, int nroPag, double presio, String titulo, String categoria) {
        this.autor = autor;
        this.nroPag = nroPag;
        this.presio = presio;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public int getNroPag() {
        return nroPag;
    }

    public double getPresio() {
        return presio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    public void setPresio(double presio) {
        this.presio = presio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrar(){
        System.out.println("Mostrando libro: ");
        System.out.println("Nombre Autor: " + autor);
        System.out.println("Numero Paginas: : " + nroPag);
        System.out.println("Precio : " + presio);
        System.out.println("Titulo : " + titulo);
        System.out.println("Categoria : " + categoria);
        System.out.println("");
    }
}
