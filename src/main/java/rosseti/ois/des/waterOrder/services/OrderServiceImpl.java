package rosseti.ois.des.waterOrder.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rosseti.ois.des.waterOrder.entities.Order;
import rosseti.ois.des.waterOrder.jpa.OrderRepository;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@AllArgsConstructor
@Transactional
public class OrderServiceImpl implements OrderService {

    private OrderRepository repository;

    @Override
    public void save(Order order) {
        order.setDate(new Date());
        repository.save(order);
    }

    @Override
    public Order get(Long id) {
        return repository.getById(id);
    }
}
