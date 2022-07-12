package airta.projetopedido.controller;


import airta.projetopedido.model.PedidoModel;
import airta.projetopedido.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PedidoController {

    @Autowired
    private PedidoRepository repository;
    @GetMapping(path = "/api/pedido/{numero_pedido}")

    public ResponseEntity consultar(@PathVariable("numero_pedido") Integer numero_pedido){
        return repository.findById(numero_pedido)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/pedido/salvar")
    public PedidoModel salvar(@RequestBody PedidoModel pedido){
        return repository.save(pedido);
    }


}
