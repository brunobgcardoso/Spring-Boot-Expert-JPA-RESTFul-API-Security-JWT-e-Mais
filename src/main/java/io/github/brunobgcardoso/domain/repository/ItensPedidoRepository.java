package io.github.brunobgcardoso.domain.repository;

import io.github.brunobgcardoso.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedidoRepository extends JpaRepository<ItemPedido, Integer> {
}
