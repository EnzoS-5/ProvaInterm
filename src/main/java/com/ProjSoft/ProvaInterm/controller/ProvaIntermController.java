package com.ProjSoft.ProvaInterm.controller;

import com.ProjSoft.ProvaInterm.dto.ProvaIntermDto;
import com.ProjSoft.ProvaInterm.entity.ProvaInterm;
import com.ProjSoft.ProvaInterm.service.ProvaIntermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/provaInterm")
public class ProvaIntermController {
    @Autowired
    private ProvaIntermService provaIntermService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProvaInterm criar(@RequestBody ProvaIntermDto dto) {
        return provaIntermService.criar(dto);
    }

    @GetMapping
    public List<ProvaInterm> listar() {
        return provaIntermService.listartodos();
    }

    @GetMapping("/{id}")
    public ProvaInterm buscar(@PathVariable Long id) {
        Optional <ProvaInterm> provaInterm = provaIntermService.buscarPorId(id);
        if (provaInterm.isPresent()) {
            return provaInterm.get();
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        provaIntermService.deletar(id);
    }
}
