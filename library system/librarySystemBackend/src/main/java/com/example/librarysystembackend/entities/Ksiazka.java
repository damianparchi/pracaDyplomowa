package com.example.librarysystembackend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "KSIAZKI")
public class Ksiazka {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;

    private String tytul;
    private String autor;
    private int rokWydania;
    private int wydanie;
    private LocalDate dataZwrotu = null;
    private LocalDate dataPoczatkuRezerwacji = null;
    private LocalDate dataKoncaRezerwacji = null;
    private int ilePrzedluzone = 0;
    private boolean gotowyDoOdbioru = false;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
                    fetch = FetchType.LAZY)
    private Uzytkownik zarezerwowanePrzezUzytkownika;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.LAZY)
    private Uzytkownik uzytkownik;

    public Ksiazka() {

    }

    public Ksiazka(String tytul, String autor, int rokWydania, int wydanie) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.wydanie = wydanie;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public int getWydanie() {
        return wydanie;
    }

    public void setWydanie(int wydanie) {
        this.wydanie = wydanie;
    }

    public LocalDate getDataZwrotu() {
        return dataZwrotu;
    }

    public void setDataZwrotu(LocalDate dataZwrotu) {
        this.dataZwrotu = dataZwrotu;
    }

    public LocalDate getDataPoczatkuRezerwacji() {
        return dataPoczatkuRezerwacji;
    }

    public void setDataPoczatkuRezerwacji(LocalDate dataPoczatkuRezerwacji) {
        this.dataPoczatkuRezerwacji = dataPoczatkuRezerwacji;
    }

    public LocalDate getDataKoncaRezerwacji() {
        return dataKoncaRezerwacji;
    }

    public void setDataKoncaRezerwacji(LocalDate dataKoncaRezerwacji) {
        this.dataKoncaRezerwacji = dataKoncaRezerwacji;
    }

    public int getIlePrzedluzone() {
        return ilePrzedluzone;
    }

    public void setIlePrzedluzone(int ilePrzedluzone) {
        this.ilePrzedluzone = ilePrzedluzone;
    }

    public boolean isGotowyDoOdbioru() {
        return gotowyDoOdbioru;
    }

    public void setGotowyDoOdbioru(boolean gotowyDoOdbioru) {
        this.gotowyDoOdbioru = gotowyDoOdbioru;
    }

    public Uzytkownik getZarezerwowanePrzezUzytkownika() {
        return zarezerwowanePrzezUzytkownika;
    }

    public void setZarezerwowanePrzezUzytkownika(Uzytkownik zarezerwowanePrzezUzytkownika) {
        this.zarezerwowanePrzezUzytkownika = zarezerwowanePrzezUzytkownika;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }
}
