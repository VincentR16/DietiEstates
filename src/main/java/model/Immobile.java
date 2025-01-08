package model;


import lombok.AllArgsConstructor;
import java.awt.*;

@AllArgsConstructor
public class Immobile {
    private Long id;
    private Long agente;
    private Long comune;
    private String indirizzo;
    private String classe_energetica;
    private String Categoria;
    private Iterable<Image> foto;
    private boolean ascensore;
    private int dimensione;
    private int numerostanze;
    private int prezzo;
    private int piano;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getDimensione() {
        return dimensione;
    }

    public void setDimensione(int dimensione) {
        this.dimensione = dimensione;
    }

    public int getNumerostanze() {
        return numerostanze;
    }

    public void setNumerostanze(int numerostanze) {
        this.numerostanze = numerostanze;
    }

    public String getClasse_energetica() {
        return classe_energetica;
    }

    public void setClasse_energetica(String classe_energetica) {
        this.classe_energetica = classe_energetica;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public Iterable<Image> getFoto() {
        return foto;
    }

    public void setFoto(Iterable<Image> foto) {
        this.foto = foto;
    }

    public boolean isAscensore() {
        return ascensore;
    }

    public void setAscensore(boolean ascensore) {
        this.ascensore = ascensore;
    }

    public Long getAgente() {
        return agente;
    }

    public void setAgente(Long agente) {
        this.agente = agente;
    }

    public Long getComune() {
        return comune;
    }

    public void setComune(Long comune) {
        this.comune = comune;
    }
}
