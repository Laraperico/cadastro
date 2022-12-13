package br.com.cadastro.cadastro.repositor;

import br.com.cadastro.cadastro.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}