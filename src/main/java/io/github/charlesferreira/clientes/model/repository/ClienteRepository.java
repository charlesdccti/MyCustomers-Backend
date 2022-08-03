package io.github.charlesferreira.clientes.model.repository;

import io.github.charlesferreira.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
