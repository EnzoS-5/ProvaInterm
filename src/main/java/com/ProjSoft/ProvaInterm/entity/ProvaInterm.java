package com.ProjSoft.ProvaInterm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tarefa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvaInterm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descricao;

    @Column
    private LocalDate dataCriacao;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoStatus status;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoPrioridade prioridade;



    public static ProvaInterm  fromDto(ProvaInterm dto) {
        ProvaInterm provaInterm = new ProvaInterm();
        provaInterm.setStatus(dto.getStatus());
        provaInterm.setPrioridade(dto.getPrioridade());
        provaInterm.setTitulo(dto.getTitulo());
        provaInterm.setDescricao(dto.getDescricao());
        return provaInterm;
    }
}
