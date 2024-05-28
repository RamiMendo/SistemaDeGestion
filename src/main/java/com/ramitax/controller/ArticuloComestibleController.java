package com.ramitax.controller;

import com.ramitax.model.Comestible;
import com.ramitax.service.ArticuloComestibleService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comestibles")
public class ArticuloComestibleController {

    @Autowired
    private ArticuloComestibleService articuloComestibleService;

    @PostMapping(consumes = "application/json")
    @Operation(summary = "Agrega un articulo comestible", description = "Debe enviar el articulo a ingresar", tags = {"Comestibles"})
    private @ResponseBody void addArticuloComestible(@RequestBody Comestible comestible){
        articuloComestibleService.addArticulosComestible(comestible);
    }

    @GetMapping(produces = "application/json")
    @Operation(summary = "Devuelve un listado de todos los articulos comestibles", description = "", tags = {"Comestibles"})
    private @ResponseBody List<Comestible> findAllComestibles(){
        return articuloComestibleService.findAllArticulosComestibles();
    }
}
