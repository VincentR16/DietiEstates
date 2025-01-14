package model.fotografia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FotografiaRepository extends JpaRepository<Fotografia, Long> {

    Optional<Fotografia> findById(Long aLong);
}
