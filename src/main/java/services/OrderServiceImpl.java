package services;

import org.springframework.stereotype.Service;
import rosseti.ois.des.waterOrder.entities.Order;
import rosseti.ois.des.waterOrder.jpa.OrderRepository;

import javax.transaction.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public void save(Order order) {
        repository.save(order);
    }

    @Override
    public Order get(Long id) {
        return repository.getById(id);
    }
}
