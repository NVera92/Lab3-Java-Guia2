import java.util.Date;
import java.util.UUID;

public class Factura {

    private UUID id;
    private double mount;
    private Date shopDate;
    private UUID clientId;

    private Venta[] products;

    public Factura(double mount,UUID clientId,Venta[] arreglo){
        this.id = UUID.randomUUID();
        this.mount = mount;
        this.shopDate = new Date();
        this.clientId = clientId;
        for (Venta v : arreglo){
            this.products = arreglo;
        }
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getMount() {
        return mount;
    }

    public void setMount(double mount) {
        this.mount = mount;
    }

    public Date getShopDate() {
        return shopDate;
    }

    public void setShopDate(Date shopDate) {
        this.shopDate = shopDate;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public void executeDiscount(double disconunt){
        double d = (disconunt/100);
        this.mount = this.mount - (this.mount * d);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", mount=" + mount +
                ", shopDate=" + shopDate +
                ", clientId=" + clientId +
                '}';
    }



}