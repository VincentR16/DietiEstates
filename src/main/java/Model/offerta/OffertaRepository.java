package model.offerta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OffertaRepository extends JpaRepository<Offerta, Long> {
    @Override
    Optional<Offerta> findById(Long aLong);
}
