package com.ProjSoft.ProvaInterm.validador;

import com.ProjSoft.ProvaInterm.dto.ProvaIntermDto;
import com.ProjSoft.ProvaInterm.entity.TipoPrioridade;
import com.ProjSoft.ProvaInterm.entity.TipoStatus;
import com.ProjSoft.ProvaInterm.exception.ValidacaoProvaIntermException;
import org.springframework.stereotype.Component;

@Component
public class ValidadorProvaInterm {

    public void validarCamposObrigatorios(ProvaIntermDto dto) {
        if (dto.getStatus() == null) {
            throw new ValidacaoProvaIntermException("Tipo de status é obrigatório");
        }
        if (dto.getTipoPrioridade() == null) {
            throw new ValidacaoProvaIntermException("Tipo de prioridade é obrigatório");
        }
        if (dto.getDescricao() == null) {
            throw new ValidacaoProvaIntermException("É obrigatório completar o campo de descrição");
        }
        if (dto.getTitulo() == null) {
            throw new ValidacaoProvaIntermException("É obrigatório completar o campo de titulo");
        }
    }

    public void validarTodo(ProvaIntermDto dto) {
        if (dto.getStatus() != TipoStatus.TODO) {
            throw new ValidacaoProvaIntermException("Tipo de status deve ser TODO");
        }
    }

    public void validarDoing(ProvaIntermDto dto) {
        if (dto.getStatus() != TipoStatus.DOING) {
            throw new ValidacaoProvaIntermException("Tipo de status deve ser DOING");
        }
    }

    public void validarDone(ProvaIntermDto dto) {
        if (dto.getStatus() != TipoStatus.DONE) {
            throw new ValidacaoProvaIntermException("Tipo de staus deve ser DONE");
        }
    }

    public void validarBaixa(ProvaIntermDto dto) {
        if (dto.getTipoPrioridade() != TipoPrioridade.BAIXA) {
            throw new ValidacaoProvaIntermException("Tipo de prioridade deve ser BAIXA");
        }
    }

    public void validarMedia(ProvaIntermDto dto) {
        if (dto.getTipoPrioridade() != TipoPrioridade.MEDIA) {
            throw new ValidacaoProvaIntermException("Tipo de prioridade deve ser MEDIA");
        }
    }

    public void validarAlta(ProvaIntermDto dto) {
        if (dto.getTipoPrioridade() != TipoPrioridade.ALTA) {
            throw new ValidacaoProvaIntermException("Tipo de prioridade deve ser ALTA");
        }
    }

}
