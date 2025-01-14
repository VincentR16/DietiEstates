package model.notifica_promozionale;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class NotificaPromozionale {

    @Id
    private long id;
    private String testo;
    private Long idAdmin;
}
