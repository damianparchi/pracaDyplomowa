package com.example.librarysystembackend.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "UZYTKOWNICY")
public class Uzytkownik {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uzytkownikId;

    @Column(name = "nazwaUzytkownika")
    private String nazwaUzytkownika;
    private String haslo;
    private boolean wlaczony = true;
    private String rola = "ROLE_USER";

    private String email;
    private String imie;
    private String nazwisko;
    private String adres;
    private String miasto;
    private String numerTelefonu;

    @OneToMany(mappedBy = "zarezerwowanePrzezUzytkownika")
    private List<Ksiazka> zarezerwowaneKsiazki;

    @OneToMany(mappedBy = "uzytkownik")
    private List<Ksiazka> ksiazki;

    @OneToMany(mappedBy = "odbiorcaPowiadomien")
    private List<Powiadomienie> powiadomienia;

    public Uzytkownik() {

    }

    public Uzytkownik(String nazwaUzytkownika, String haslo, String email, String imie,
                      String nazwisko, String adres, String miasto, String numerTelefonu) {
        super();
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.haslo = haslo;
        this.email = email;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.miasto = miasto;
        this.numerTelefonu = numerTelefonu;
    }

    public long getUzytkownikId() {
        return uzytkownikId;
    }

    public void setUzytkownikId(long uzytkownikId) {
        this.uzytkownikId = uzytkownikId;
    }

    public String getNazwaUzytkownika() {
        return nazwaUzytkownika;
    }

    public void setNazwaUzytkownika(String nazwaUzytkownika) {
        this.nazwaUzytkownika = nazwaUzytkownika;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public boolean isWlaczony() {
        return wlaczony;
    }

    public void setWlaczony(boolean wlaczony) {
        this.wlaczony = wlaczony;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }
}
