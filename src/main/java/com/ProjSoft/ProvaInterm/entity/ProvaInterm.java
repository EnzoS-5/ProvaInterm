package com.ProjSoft.ProvaInterm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class ProvaInterm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDate data;

    public static ProvaInterm  fromDto(ProvaInterm dto) {
        ProvaInterm provaInterm = new ProvaInterm();

        return provaInterm;
    }
}
