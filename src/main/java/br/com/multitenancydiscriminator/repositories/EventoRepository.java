package br.com.multitenancydiscriminator.repositories;

import br.com.multitenancydiscriminator.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

}
