package rosseti.ois.des.waterOrder.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String full_name;
    private String address;
    private Long cabinet;

    private Long quantityOfWater;

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
