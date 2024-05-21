package com.ramitax.controller;

import com.ramitax.model.Envase;
import com.ramitax.service.EnvaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/envases")
public class EnvaseController {

    @Autowired
    private EnvaseService envaseService;

    @GetMapping(value = "/")
    public @ResponseBody List<Envase> getAllEnvases(){
        return envaseService.getAllEnvases();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Optional<Envase> getEnvaseById(@PathVariable("id") Integer id){
        return envaseService.getEnvaseById(id);
    }

    @PostMapping(value="/", consumes = "application/json")
    public @ResponseBody Envase addEnvase(@RequestBody Envase envase){
        return envaseService.addEnvase(envase);
    }

    @PutMapping(path = "/{id}", consumes = "application/json")
    public @ResponseBody Envase updateEnvase(@RequestBody Envase envase){
        return envaseService.updateEnvase(envase);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public @ResponseBody void deleteEnvase(@PathVariable("id") Integer id){
         envaseService.deleteEnvase(id);
    }
}
