package model.offerta;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Offerta {

    @Id
    private Long id;
    private String stato;
    private int proposta;
    private int idAnnuncio;
    private int idCliente;
}

