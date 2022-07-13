package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Pedido {
    @Id
    @GeneratedValue
    private int numero_pedido;

    @OneToMany(targetEntity = Item.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "numero_pedido")
    private List<Item> Itens;
}
