package poo.modelos.libro;

public class Libro {
  private String titulo;
  private String autor;
  private int paginas;

  public Libro(String titulo, String autor, int paginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
  }
  public Libro() {
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getPaginas() {
    return paginas;
  }

  public void setPaginas(int paginas) {
    this.paginas = paginas;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public void  numeroPaginas(int numeroPaginas){
    paginas=numeroPaginas*7;
  }
  public void imprimirDetalles(){
    System.out.println("El libro de llama: " + getTitulo() + " el autor es: " +getAutor()+ " el número de paginas es: "+ getPaginas());
  }
  public void imprimirLibro(){
    System.out.println("El libro de llama: " + getTitulo());
  }
}
