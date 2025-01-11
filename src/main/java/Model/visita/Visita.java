package model.visita;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Visita {

    @Id
    private Long id;

    private Long cliente;
    private Long immobile;
    private Long agente;
}
