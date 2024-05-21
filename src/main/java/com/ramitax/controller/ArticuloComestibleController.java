package com.ramitax.controller;

import com.ramitax.model.Comestible;
import com.ramitax.service.ArticuloComestibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comestibles")
public class ArticuloComestibleController {

    @Autowired
    private ArticuloComestibleService articuloComestibleService;

    @PostMapping(value = "/", consumes = "application/json")
    private @ResponseBody void addArticuloComestible(@RequestBody Comestible comestible){
        articuloComestibleService.addArticulosComestible(comestible);
    }

//    @GetMapping(value="/", produces = "application/json")
//    private @ResponseBody List<>
}
