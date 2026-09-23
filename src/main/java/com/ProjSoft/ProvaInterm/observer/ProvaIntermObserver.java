package com.ProjSoft.ProvaInterm.observer;

import com.ProjSoft.ProvaInterm.entity.ProvaInterm;
import com.ProjSoft.ProvaInterm.entity.TipoStatus;

public interface ProvaIntermObserver {
    void atualizar(ProvaInterm provaInterm, TipoStatus statusAntigo, TipoStatus statusNovo);
}
