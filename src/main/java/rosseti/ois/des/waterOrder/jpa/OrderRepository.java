package rosseti.ois.des.waterOrder.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import rosseti.ois.des.waterOrder.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
