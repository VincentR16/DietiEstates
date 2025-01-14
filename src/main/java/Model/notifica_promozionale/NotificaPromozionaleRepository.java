package model.notifica_promozionale;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface NotificaPromozionaleRepository extends JpaRepository<NotificaPromozionale, Long> {

    Optional<NotificaPromozionale> findById(Long aLong);
}
