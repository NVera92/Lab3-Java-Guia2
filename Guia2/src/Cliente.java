import java.util.UUID;

public class Cliente {

    private UUID id;
    private String name;
    private String surmane;
    private String email;
    public double discount;

    public Cliente(String name,String surmane,String email,double discount){
        this.id = UUID.randomUUID();
        this.name = name;
        this.surmane = surmane;
        this.email = email;
        this.discount = discount;

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurmane() {
        return surmane;
    }

    public void setSurmane(String surmane) {
        this.surmane = surmane;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surmane='" + surmane + '\'' +
                ", email='" + email + '\'' +
                ", discount=" + discount +
                '}';
    }
}
