import java.util.Scanner;

public class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private char genero;


    public Persona(String nombre,String apellido,String email,char genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public static int arregloPersona(Persona arreglo[]){
        int i = 0;
        int flag = 0;

        String nombre;
        String apellido;
        String email;
        String generoString;
        char genero;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Ingrese el nombre del autor: ");
            nombre = scan.nextLine();
            System.out.println("Ingrese el apellido del autor: ");
            apellido = scan.nextLine();
            System.out.println("Ingrese el email del autor: ");
            email = scan.nextLine();
            System.out.println("Ingrese el genero del autor M / F: ");
            generoString = scan.next();
            genero = generoString.charAt(0);

            arreglo[i] = new Persona(nombre,apellido,email,genero);
            i++;

            System.out.println("Desea agregar otro autor al libro? SI:1 / NO:0");
            flag = scan.nextInt();

        }while(flag != 0);


        return i;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void mostrarPersona(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Email: "+this.email);
        System.out.println("Genero: "+this.genero);
    }

}
