package model.notifca_specifica;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NotificaSpecificaRepository extends JpaRepository<NotificaSpecifica,Long> {

    Optional<NotificaSpecifica> findById(Long id);
}
