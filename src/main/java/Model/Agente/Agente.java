package Model.Agente;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Agente {

    private Long id;
    private String username;
    private String password;
    private String email;
    private String nome;
    private String cognome;
    private Date dataDiNascita;
    private String Agenzia;


}
