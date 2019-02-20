package com.jmhreif.mongocodewars;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepo orderRepo;

    @GetMapping("/")
    public Iterable<Order> findAllOrders() { return orderRepo.findAll(); }

    @GetMapping("/findbyorderid")
    public Order findByOrderId(@RequestParam Long orderId) {
        return orderRepo.findByOrOrderId(orderId);
    }
}
