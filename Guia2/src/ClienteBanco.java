import java.util.UUID;

public class ClienteBanco {
    private UUID id;
    private String nombre;
    private String genero;

    public ClienteBanco() {
    }

    public ClienteBanco(String nombre, String genero) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ClienteBanco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}


