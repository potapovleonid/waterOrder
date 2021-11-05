package rosseti.ois.des.waterOrder.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "order_tbl")
public class Order {
    private static final String SEQUANCE_NAME = "order_seq";

    @Id
    @Column(name = "order_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUANCE_NAME)
    @SequenceGenerator(name = SEQUANCE_NAME, sequenceName = SEQUANCE_NAME, allocationSize = 1)
    private Long id;

    @Column(name = "login_fld")
    private String login;

    @Column(name = "full_name_fld")
    private String full_name;

    @Column(name = "address_fld")
    private String address;

    @Column(name = "cabinet_fld")
    private Integer cabinet;

    @Column(name = "quantity_of_water_fld")
    private Integer quantityOfWater;

    @Column(name = "data_created_fld")
    private Date date;

    public Order(String login, String full_name, String address, Integer cabinet, Integer quantityOfWater) {
        this.login = login;
        this.full_name = full_name;
        this.address = address;
        this.cabinet = cabinet;
        this.quantityOfWater = quantityOfWater;
    }

    @Override
    public String toString() {
        return "Order{" +
                "login='" + login + '\'' +
                ", \nfull_name='" + full_name + '\'' +
                ", \naddress='" + address + '\'' +
                ", \ncabinet=" + cabinet +
                ", \nquantityOfWater=" + quantityOfWater +
                '}';
    }
}
