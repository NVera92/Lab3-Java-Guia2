import java.util.Locale;
import java.util.Scanner;

public class Libro {

    /*
    Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
    precio, stock y Autor, este último posee las características de nombre, apellido,
    email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
    único autor. Ejecute las siguientes instrucciones:
    a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
    b. Imprima por pantalla al autor previamente instanciado.
    c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
    pesos con una cantidad de 150 copias.
    d. Imprima por pantalla el libro instanciado.
    e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
    cantidad en 50 copias.
    f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
    Libro “Effective Java”.
    g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
    siguiente mensaje:
            “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
    h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
    cambios necesarios en el método del punto g, para imprimir un nuevo
    mensaje que liste los autores que contribuyeron a ese libro.

     */

    private String titulo;
    private double precio;
    private int stock;
    public Persona [] autor = new Persona[1];


    public Libro(String titulo,double precio,int stock,Persona arreglo[]){
        int i;

        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;

        for(Persona p:arreglo){
            this.autor = arreglo;
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void aumentarStock(int stock){
        this.stock = this.stock+stock;
    }

   public void pantalla(int cantidadAutor){
       //System.out.println("El libro, "+this.titulo+" de "+this.autor[cantidadAutor].getNombre()+" "+this.autor[].getApellido()+". Se vende a "+this.precio+" pesos.");
   }

    public void mostrarLibro(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Precio: "+this.precio);
        System.out.println("Stock: "+this.stock);
        System.out.println();

        System.out.println("Autor: ");
        for(Persona p: autor){
            p.mostrarPersona();
            System.out.println();
        }
    }
}
