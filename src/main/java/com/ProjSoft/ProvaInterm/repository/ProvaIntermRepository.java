package com.ProjSoft.ProvaInterm.repository;

import com.ProjSoft.ProvaInterm.entity.ProvaInterm;
import com.ProjSoft.ProvaInterm.service.ProvaIntermService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvaIntermRepository extends JpaRepository<ProvaInterm,long> {
}
