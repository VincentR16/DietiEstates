package model.notifca_specifica;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class NotificaSpecifica {

    @Id
    private Long id;
    private String testo;
    private Long idOfferta;
    private Long idVisita;

}
