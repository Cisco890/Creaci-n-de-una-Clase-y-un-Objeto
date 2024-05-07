public class Libro {
    // Atributos
    String titulo;
    String autor;
    String ISBN;
    double precio;

    // Constructor sin parámetros
    public Libro() {
        this.titulo = "Título desconocido";
        this.autor = "Autor desconocido";
        this.ISBN = "ISBN desconocido";
        this.precio = 0.0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, String ISBN, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    // Métodos
    public void mostrarDetalles() {
        System.out.println("Detalles del libro:");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Precio: $" + this.precio);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El precio del libro se ha actualizado a: $" + this.precio);
    }
}
