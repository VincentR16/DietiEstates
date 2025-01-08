package model.immobile;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Immobile {
    @Id
    private Long id;
    private Long agente;
    private Long comune;
    private String indirizzo;
    private String classeEnergetica;
    private String categoria;
    private boolean ascensore;
    private int dimensione;
    private int numeroStanze;
    private int prezzo;
    private int piano;
}
