package com.ProjSoft.ProvaInterm.Service;

import com.ProjSoft.ProvaInterm.repository.ProvaIntermRepository;
import com.ProjSoft.ProvaInterm.service.ProvaIntermService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProvaIntermServiceTests {
    @InjectMocks
    private ProvaIntermService provaIntermService;

    @Mock
    private ProvaIntermRepository provaIntermRepository;


}
