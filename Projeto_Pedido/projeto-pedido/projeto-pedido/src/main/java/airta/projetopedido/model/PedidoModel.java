package airta.projetopedido.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "pedido")
public class PedidoModel {

    @Id
    public Integer numero_pedido;

    @Column(nullable = false,length = 10)
    public Integer codigo_produto;
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

    public Integer getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(Integer codigo_produto) {
        this.codigo_produto = codigo_produto;
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
