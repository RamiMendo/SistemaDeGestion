package com.ramitax.service;

import com.ramitax.model.Servicio;
import com.ramitax.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    public void addArticuloService(Servicio servicio){
        servicioRepository.save(servicio);
    }
}
