package Model;


import lombok.AllArgsConstructor;
import java.util.Date;

@AllArgsConstructor
public class Agente {

    private Long id;
    private String username;
    private String password;
    private String email;
    private String nome;
    private String cognome;
    private Date dataDiNascita;
    private String Agenzia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getAgenzia() {
        return Agenzia;
    }

    public void setAgenzia(String agenzia) {
        Agenzia = agenzia;
    }
}
