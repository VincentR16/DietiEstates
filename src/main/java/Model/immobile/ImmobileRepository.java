package Model.immobile;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImmobileRepository extends JpaRepository<Immobile, Long> {

     Optional<Immobile>  findImmobileById(Long id);
}
