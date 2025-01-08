package model.agenzia;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AgenziaRepository extends JpaRepository<Agenzia,Long> {

   Optional<Agenzia> findAgenziaById(Long id);
}
