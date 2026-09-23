package com.ProjSoft.ProvaInterm.observer;

import com.ProjSoft.ProvaInterm.entity.ProvaInterm;
import com.ProjSoft.ProvaInterm.entity.TipoStatus;

public interface ProvaIntermObservable {
    void notificarObserver(ProvaInterm provaInterm, TipoStatus statusAntigo);
}
