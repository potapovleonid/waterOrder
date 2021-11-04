package services;

import rosseti.ois.des.waterOrder.entities.Order;

public interface OrderService {
    void save(Order order);
    Order get(Long id);
}
