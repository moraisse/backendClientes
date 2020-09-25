package pt.com.smorais.clientes.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.com.smorais.clientes.backend.model.entity.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
