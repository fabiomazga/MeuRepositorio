package controller;


import com.trinity.jpa.dto.OrderRequest;
import entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.ItemRepository;
import repository.PedidoRepository;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ItemRepository itemRepository;

    @PostMapping("/placeOrder")
    public Pedido placeOrder(@RequestBody OrderRequest request){
        return pedidoRepository.save(request.getPedido());
    }

    @GetMapping("/findAllOrders")
    public List<Pedido> findAllOrders() {
        return pedidoRepository.findAll();
    }
}
