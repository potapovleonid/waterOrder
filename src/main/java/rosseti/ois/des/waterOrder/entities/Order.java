package rosseti.ois.des.waterOrder.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    @Id
    @Column(name = "order_id", nullable = false)
    private Long id;

    @Column(name = "full_name_fld")
    private String full_name;

    @Column(name = "address_fld")
    private String address;

    @Column(name = "cabinet_fld")
    private Long cabinet;

    @Column(name = "quantity_of_water_fld")
    private Long quantityOfWater;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCabinet() {
        return cabinet;
    }

    public void setCabinet(Long cabinet) {
        this.cabinet = cabinet;
    }

    public Long getQuantityOfWater() {
        return quantityOfWater;
    }

    public void setQuantityOfWater(Long quantityOfWater) {
        this.quantityOfWater = quantityOfWater;
    }

    @Override
    public String toString() {
        return "OrderTest{" +
                "full_name='" + full_name + '\'' + "\n" +
                ", address='" + address + '\'' + "\n" +
                ", cabinet=" + cabinet + "\n" +
                ", quantityOfWater=" + quantityOfWater +
                '}';
    }
}
