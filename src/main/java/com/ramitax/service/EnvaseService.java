package com.ramitax.service;

import com.ramitax.model.Envase;
import com.ramitax.repository.EnvaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnvaseService {

    @Autowired
    private EnvaseRepository envaseRepository;

    public List<Envase> getAllEnvases(){
        return envaseRepository.findAll();
    }

    public Optional<Envase> getEnvaseById(Integer id){
        return envaseRepository.findById(id);
    }

    public Envase addEnvase(Envase envase){
        return envaseRepository.save(envase);
    }

    public void deleteEnvase(Integer id){

    }
}
