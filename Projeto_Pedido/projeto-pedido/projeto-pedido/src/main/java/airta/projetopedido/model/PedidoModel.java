package airta.projetopedido.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "pedido")
public class PedidoModel {

    @Id
    public Integer numero_pedido;

    @Column(nullable = false,length = 10)
    public Integer codigo_item;
    @Column(nullable = false,length = 10)
    public Float preco;
    @Column(nullable = false,length = 10)
    public Integer quantidade;

    public Integer getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(Integer numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public Integer getCodigo_item() {
        return codigo_item;
    }

    public void setCodigo_item(Integer codigo_item) {
        this.codigo_item = codigo_item;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
