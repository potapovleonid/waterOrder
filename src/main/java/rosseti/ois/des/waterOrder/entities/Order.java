//package rosseti.ois.des.waterOrder.entities;
//
//import javax.persistence.*;
//
//@Entity
//public class Order {
//    @Id
//    @Column(name = "order_id", nullable = false)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @Column(name = "quantity_of_water_fld")
//    private int quantityOfWater;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public int getQuantityOfWater() {
//        return quantityOfWater;
//    }
//
//    public void setQuantityOfWater(int quantityOfWater) {
//        this.quantityOfWater = quantityOfWater;
//    }
//}
