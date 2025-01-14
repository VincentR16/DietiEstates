package model.gestore_agenzia;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GestoreAgenziaRepository extends JpaRepository<GestoreAgenzia, Long> {

    Optional<GestoreAgenzia> findById(Long aLong);
}
