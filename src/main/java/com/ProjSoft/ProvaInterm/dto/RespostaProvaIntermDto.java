package com.ProjSoft.ProvaInterm.dto;

import com.ProjSoft.ProvaInterm.entity.ProvaInterm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespostaProvaIntermDto {
    private boolean criado;
    private ProvaInterm provaInterm;
}
