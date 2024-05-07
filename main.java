public class main {
    public static void main(String[] args) {
        // Crea un objeto 'libro1' utilizando el constructor sin parámetros

        // Crea un objeto 'libro' utilizando el constructor con parámetros
        Libro libro = new Libro("El Extrangero", "Albert", "9788499082478", 19.99);

        // Llama a los métodos 'mostrarDetalles' y 'actualizarPrecio' para 'libro'
        libro.mostrarDetalles();
        System.out.println("-------------------------------------------------");
        libro.actualizarPrecio(29.99);
        System.out.println("-------------------------------------------------");
        libro.mostrarDetalles();

    }
}
