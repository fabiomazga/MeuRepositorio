//package airta.projetopedido.controller;
//
//import airta.projetopedido.model.ItemModel;
//import airta.projetopedido.repository.ItemRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//public class ItemController {
//
//    @Autowired
//    private ItemRepository repository;
//
//    @GetMapping(path = "/api/item/{codigo_item}")
//    public ResponseEntity consultar(@PathVariable("codigo_item") Integer codigo_item){
//        return repository.findById(codigo_item)
//                .map(record -> ResponseEntity.ok().body(record))
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping(path = "/api/item/salvar")
//    public ItemModel salvar(@RequestBody ItemModel item){
//        return repository.save(item);
//    }
//
//}
