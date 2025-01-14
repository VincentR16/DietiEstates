package model.ricerca;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Ricerca {

    @Id
    private Long id;
    private Date data;
    private String testo;
    private Long  idCliente;

}
