package com.ProjSoft.ProvaInterm.service;

import com.ProjSoft.ProvaInterm.dto.ProvaIntermDto;
import com.ProjSoft.ProvaInterm.entity.ProvaInterm;
import com.ProjSoft.ProvaInterm.entity.TipoPrioridade;
import com.ProjSoft.ProvaInterm.entity.TipoStatus;
import com.ProjSoft.ProvaInterm.exception.ValidacaoProvaIntermException;
import com.ProjSoft.ProvaInterm.repository.ProvaIntermRepository;
import com.ProjSoft.ProvaInterm.validador.ValidadorProvaInterm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvaIntermService {
    @Autowired
    private ProvaIntermRepository provaIntermRepository;

    public ProvaInterm criar(ProvaIntermDto dto) {
        validarTarefa(dto);
        ProvaInterm provaInterm = ProvaInterm.fromDto(dto);
        ProvaInterm salvo = provaIntermRepository.save(provaInterm);
        return salvo;
    }

    public List<ProvaInterm> listartodos() {
        return provaIntermRepository.findAll();
    }

    public Optional<ProvaInterm> buscarPorId(Long id) {
        return provaIntermRepository.findById(id);
    }

    public boolean deletar(long id) {
        if(provaIntermRepository.existsById(id)) {
            provaIntermRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private void validarTarefa(ProvaIntermDto dto) {
        ValidadorProvaInterm validadorPorvaIntermBase = new ValidadorProvaInterm();
        validadorPorvaIntermBase.validarCamposObrigatorios(dto);

        if (dto.getStatus() == TipoStatus.TODO) {
            validadorPorvaIntermBase.validarTodo(dto);
        } else if (dto.getStatus() == TipoStatus.DOING) {
            validadorPorvaIntermBase.validarDoing(dto);
        } else if (dto.getStatus() == TipoStatus.DONE) {
            validadorPorvaIntermBase.validarDone(dto);
        }

        if (dto.getTipoPrioridade() == TipoPrioridade.BAIXA) {
            validadorPorvaIntermBase.validarBaixa(dto);
        } else if (dto.getTipoPrioridade() == TipoPrioridade.MEDIA) {
            validadorPorvaIntermBase.validarMedia(dto);
        } else if (dto.getTipoPrioridade() == TipoPrioridade.ALTA) {
            validadorPorvaIntermBase.validarAlta(dto);
        }
    }
}
