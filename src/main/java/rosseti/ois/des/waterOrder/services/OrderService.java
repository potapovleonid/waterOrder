package rosseti.ois.des.waterOrder.services;

import org.springframework.stereotype.Service;
import rosseti.ois.des.waterOrder.entities.Order;

@Service
public interface OrderService {
    void save(Order order);

    Order get(Long id);
}
