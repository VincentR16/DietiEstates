package model.cliente;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "Cliente")

public class Cliente {

    @Id
    private Long id;

    private String nome;

    private String cognome;

    private String username;

    private String password;

    private Date dataNascita;
}
