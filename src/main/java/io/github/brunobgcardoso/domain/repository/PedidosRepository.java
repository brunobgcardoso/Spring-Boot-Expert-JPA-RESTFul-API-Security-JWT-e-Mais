package io.github.brunobgcardoso.domain.repository;

import io.github.brunobgcardoso.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedido, Integer> {
}
