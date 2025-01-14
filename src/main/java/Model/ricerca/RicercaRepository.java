package model.ricerca;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RicercaRepository extends JpaRepository<Ricerca, Long> {
    Optional<Ricerca> findById(Long aLong);
}
