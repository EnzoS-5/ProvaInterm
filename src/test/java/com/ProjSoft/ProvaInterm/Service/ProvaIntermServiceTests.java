package com.ProjSoft.ProvaInterm.Service;

import com.ProjSoft.ProvaInterm.dto.ProvaIntermDto;
import com.ProjSoft.ProvaInterm.entity.ProvaInterm;
import com.ProjSoft.ProvaInterm.entity.TipoPrioridade;
import com.ProjSoft.ProvaInterm.repository.ProvaIntermRepository;
import com.ProjSoft.ProvaInterm.service.ProvaIntermService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

import static jdk.internal.classfile.impl.verifier.VerifierImpl.verify;
import static jdk.jfr.internal.jfc.model.Constraint.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProvaIntermServiceTests {
    @InjectMocks
    private ProvaIntermService provaIntermService;

    @Mock
    private ProvaIntermRepository provaIntermRepository;

    private ProvaIntermDto novaProvaIntermDto(){
        ProvaIntermDto dto = new ProvaIntermDto();
        dto.getTipoPrioridade();
        dto.getStatus();
        //dto.getTitulo("Teste");
        //dto.getDescricao("Texto teste mais longo");
        dto.getTipoPrioridade();
        return dto;
    };

//    @Test
//    void listaAtivosSemFiltro() {
//        when(repository.findByAtivoTrue()).thenReturn(listar.of(new ProvaInterm()));
//        assertEquals(1, service.listar(null).size());
//        verify(repository).findByAtivoTrue();
//    }
//
//
//    @Test
//    void criar() {
//        ProvaInterm salvo = new Curso(1L, "Java", "Curso", true);
//        when(repository.save(any(Curso.class))).thenReturn(salvo);
//        Curso resposta = service.criar(new ProvaIntermDto("Java", "Curso"));
//        assertTrue(resposta.getAtivo());
//        assertEquals(1L, resposta.getId());
//    }
//
//    @Test
//    void deletaLogicamente() {
//        ProvaInterm provaInterm = new ProvaInterm(1L, "Java", "Curso", true);
//        when(repository.findById(1L)).thenReturn(Optional.of(curso));
//        service.deletar(1L);
//        assertFalse(provaInterm.getAtivo());
//        verify(repository).save(curso);
//    }
//
//    @Test void retorna404AoDeletarInexistente() {
//        when(repository.findById(99L)).thenReturn(Optional.empty());
//        assertThrows(ResponseStatusException.class, () -> service.deletar(99L));
//        verify(repository, never()).save(any());
//    }
}

