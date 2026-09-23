package com.ProjSoft.ProvaInterm.observer;

import com.ProjSoft.ProvaInterm.entity.ProvaInterm;
import com.ProjSoft.ProvaInterm.entity.TipoPrioridade;
import com.ProjSoft.ProvaInterm.entity.TipoStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Observer;

@Component
public class AuditLoggerObserver implements ProvaIntermObserver {
    private static final Logger logger = LoggerFactory.getLogger(AuditLoggerObserver.class);

    @Override
    public void atualizar(ProvaInterm provaInterm, TipoPrioridade prioridadeAntiga, TipoPrioridade prioridadeNovo) {
        String mensagem = String.format(
                "AUDITORIA - Prioridade ID: %d | Status: %s → %s | Valor: %s",
                provaInterm.getId(),
                prioridadeAntiga.toString(),
                prioridadeNovo.toString()
        );
        logger.info(mensagem);
    }
}
