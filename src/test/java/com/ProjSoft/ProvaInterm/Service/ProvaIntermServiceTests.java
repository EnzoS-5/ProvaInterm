package com.ProjSoft.ProvaInterm.Service;

import com.ProjSoft.ProvaInterm.dto.ProvaIntermDto;
import com.ProjSoft.ProvaInterm.entity.ProvaInterm;
import com.ProjSoft.ProvaInterm.entity.TipoPrioridade;
import com.ProjSoft.ProvaInterm.repository.ProvaIntermRepository;
import com.ProjSoft.ProvaInterm.service.ProvaIntermService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

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

    public void test_shouldCreateWhenDataIsValid() {
        ProvaIntermDto dto = new ProvaIntermDto();

        ArgumentCaptor<ProvaInterm> captor = ArgumentCaptor.forClass(ProvaInterm.class);
        Mockito.when(ProvaIntermRepository.save(captor.capture()))
                .thenAnswer(invocation -> invocation.getArgument(0));

        ProvaInterm response = ProvaIntermService.criar(dto);

        Assertions.assertEquals("Java Avançado", response.getTitulo());
        Assertions.assertEquals("Muito Avançado mesmo", response.getDescricao());
//        Assertions.assertFalse(response.isDeletado());
        // confirma que o service preencheu a data de criação sozinho, sem depender do cliente
        Assertions.assertNotNull(captor.getValue().getDataCriacao());
    }
}
