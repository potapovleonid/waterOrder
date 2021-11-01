package rosseti.ois.des.waterOrder.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "full_name_fld")
    private String full_name;

    @Column(name = "addres_fld")
    private String address;

    @Column(name = "cabinet_fld")
    private Long cabinet;

    @Column(name = "active_fld")
    private boolean active;

}
