package autor_libro;

public class Libro {

    private int idLibro;
    private String nombre;
    private String descripcion;
    private int nroPaginas;
    private int idAutor;

    public Libro() {
    }

    public Libro(int idLibro, String nombre, String descripcion, int nroPaginas, int idAutor) {
        this.idLibro = idLibro;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nroPaginas = nroPaginas;
        this.idAutor = idAutor;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", nombre=" + nombre + ", descripcion=" + descripcion + ", nroPaginas=" + nroPaginas + ", idAutor=" + idAutor + '}';
    }
    
    //(5) METODOS OTROS
    public static int retornaCodigoAutorCiencia(Libro[] x, String cadena) {
        int idAutorAux = 0;
        Libro libro = null;
        for(int i=0; i<x.length; i++) {
            libro = x[i];
            String nombre = libro.getNombre();
            String descri = libro.getDescripcion();
            int idAutor = libro.getIdAutor();
            if(descri.equalsIgnoreCase(cadena)) {
               //Libro l5 = new Libro(5,"Física","Ciencia",250,2); 
               idAutorAux = idAutor;
               break;
            }
        }
        return idAutorAux;
    }
    

}
