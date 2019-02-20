package com.jmhreif.mongocodewars;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {

    Order findByOrOrderId(Long orderId);
}
