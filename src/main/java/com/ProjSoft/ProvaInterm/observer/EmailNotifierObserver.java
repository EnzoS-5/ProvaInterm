package com.ProjSoft.ProvaInterm.observer;

import com.ProjSoft.ProvaInterm.entity.ProvaInterm;
import com.ProjSoft.ProvaInterm.entity.TipoPrioridade;
import org.springframework.stereotype.Component;

@Component
public class EmailNotifierObserver implements ProvaIntermObserver {

    @Override
    public void atualizar(ProvaInterm provaInterm, TipoPrioridade prioridadeAntiga, TipoPrioridade prioridadeNova) {
        String mensagem = String.format(
                "EMAIL ENVIADO - Tarefa ID: %d mudou para status: %s",
                provaInterm.getId(),
                prioridadeNova
        );
        System.out.println(mensagem);
    }
}
