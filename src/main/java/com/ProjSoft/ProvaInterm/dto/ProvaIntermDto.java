package com.ProjSoft.ProvaInterm.dto;

import com.ProjSoft.ProvaInterm.entity.TipoPrioridade;
import com.ProjSoft.ProvaInterm.entity.TipoStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProvaIntermDto {
    private TipoStatus status;
    private TipoPrioridade  tipoPrioridade;
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
}
