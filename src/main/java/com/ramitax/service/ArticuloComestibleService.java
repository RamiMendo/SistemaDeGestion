package com.ramitax.service;

import com.ramitax.exception.ArticuloException;
import com.ramitax.model.Comestible;
import com.ramitax.repository.ComestibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloComestibleService {

    @Autowired
    private ComestibleRepository comestibleRepository;

    public List<Comestible> findAllArticulosComestibles(){
        return comestibleRepository.findAll();
    }

    public Page<Comestible> findAllArticulosComestiblesPageable(Pageable pageable){
        return comestibleRepository.findAll(pageable);
    }

    public Comestible findArticuloComestibleById(Integer idComestible) throws ArticuloException {
        Optional<Comestible> comestible = comestibleRepository.findById(idComestible);

        if(comestible.isEmpty()){
            throw new ArticuloException("Articulo No Encontrado!", HttpStatus.NOT_FOUND);
        }else{
            return comestible.get();
        }
    }

    public void addArticulosComestible(Comestible comestible){
        comestibleRepository.save(comestible);
    }

    public void deleteArticulosComestibles(Integer idComestible) throws ArticuloException {
        Optional<Comestible> comestible = comestibleRepository.findById(idComestible);

        if(comestible.isEmpty()){
            throw new ArticuloException("Articulo No Encontrado!", HttpStatus.NOT_FOUND);
        }else{
            comestibleRepository.delete(comestible.get());
        }
    }

    public Comestible updateArticuloComestible(Comestible comestible){
        return comestibleRepository.save(comestible);
    }
}
