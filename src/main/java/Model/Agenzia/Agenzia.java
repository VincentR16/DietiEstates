package Model.Agenzia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Agenzia {

    private Long id;
    private String nome;
    private String sedeLegale;
    private Long gestore;
    private Long admin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSedeLegale() {
        return sedeLegale;
    }

    public void setSedeLegale(String sedeLegale) {
        this.sedeLegale = sedeLegale;
    }

    public Long getGestore() {
        return gestore;
    }

    public void setGestore(Long gestore) {
        this.gestore = gestore;
    }

    public Long getAdmin() {
        return admin;
    }

    public void setAdmin(Long admin) {
        this.admin = admin;
    }
}
