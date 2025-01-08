package Model.agenzia;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Agenzia {

    @Id
    private Long id;
    private Long gestore;
    private Long admin;


    private String nome;
    private String sedeLegale;
}
