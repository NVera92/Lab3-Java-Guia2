import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CuentaBanco {
    private UUID id;
    private Double balance;
    private String client;

    private List<String> movent;
    public CuentaBanco() {
    }

    public CuentaBanco(UUID id, Double balance, String client) {
        this.id = id;
        this.balance = balance;
        this.client = client;
        this.movent = new ArrayList<String>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void extract(double mount){
        if(mount <= (this.balance-2000)){
            this.balance = this.balance - mount;
            this.movent.add("El cliente "+this.client+", deposito: $"+mount);
        }else{
            System.out.println("El monto a extraer supera el balance actual.");
        }
    }

    public void deposit(Double mount){
        this.balance = this.balance + mount;
        this.movent.add("El cliente "+this.client+", retiro: $"+mount);
    }

    @Override
    public String toString() {
        return "CuentaBanco{" +
                "id=" + id +
                ", balance=" + balance +
                ", client='" + client + '\'' +
                '}';
    }

    public void lastMotion(String[] arreglo){
        for(String s : arreglo){
            System.out.println(s);
        }
    }
}
