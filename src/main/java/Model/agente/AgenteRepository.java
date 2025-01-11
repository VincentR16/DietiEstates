package model.agente;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AgenteRepository extends JpaRepository<Agente, Long> {


    Optional<Agente> findAgenteById(Long aLong);
}
