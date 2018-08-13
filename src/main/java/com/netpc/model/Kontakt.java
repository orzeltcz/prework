package com.netpc.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="KONTAKT")
public class Kontakt {
    private Long id;
    private String imie;
    private String nazwisko;
    private String email;
    private String haslo;
    private String K;



}
