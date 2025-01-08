package Model.visita;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitRepository extends JpaRepository<Visita, Long> {
    Optional<Visita> findVisitaById(Long id);
}
