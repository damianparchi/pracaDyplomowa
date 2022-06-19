package com.example.librarysystembackend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Powiadomienie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long powiadomienieId;
    private LocalDate dataPowiadomienia;
    private LocalDate dataWaznosci;
    private String wiadomoscPowiadomienia;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
                    fetch = FetchType.LAZY)
    private Uzytkownik odbiorcaPowiadomien;

    public Powiadomienie() {

    }

    public Powiadomienie(LocalDate dataPowiadomienia, LocalDate dataWaznosci, String wiadomoscPowiadomienia) {
        this.dataPowiadomienia = dataPowiadomienia;
        this.dataWaznosci = dataWaznosci;
        this.wiadomoscPowiadomienia = wiadomoscPowiadomienia;
    }

    public long getPowiadomienieId() {
        return powiadomienieId;
    }

    public void setPowiadomienieId(long powiadomienieId) {
        this.powiadomienieId = powiadomienieId;
    }

    public LocalDate getDataPowiadomienia() {
        return dataPowiadomienia;
    }

    public void setDataPowiadomienia(LocalDate dataPowiadomienia) {
        this.dataPowiadomienia = dataPowiadomienia;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }

    public void setDataWaznosci(LocalDate dataWaznosci) {
        this.dataWaznosci = dataWaznosci;
    }

    public String getWiadomoscPowiadomienia() {
        return wiadomoscPowiadomienia;
    }

    public void setWiadomoscPowiadomienia(String wiadomoscPowiadomienia) {
        this.wiadomoscPowiadomienia = wiadomoscPowiadomienia;
    }
}
