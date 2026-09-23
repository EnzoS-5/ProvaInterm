package com.ProjSoft.ProvaInterm.service;

import com.ProjSoft.ProvaInterm.dto.ProvaIntermDto;
import com.ProjSoft.ProvaInterm.entity.ProvaInterm;
import com.ProjSoft.ProvaInterm.repository.ProvaIntermRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvaIntermService {
    @Autowired
    private ProvaIntermRepository provaIntermRepository;

    public ProvaInterm criar(ProvaIntermDto dto) {
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
}
