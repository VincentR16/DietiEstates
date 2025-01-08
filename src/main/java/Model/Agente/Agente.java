package Model.Agente;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Agente {


    @Id
    private Long id;
    private Long agenzia;
    private String username;
    private String password;
    private String email;
    private String nome;
    private String cognome;
    private Date dataDiNascita;

}
