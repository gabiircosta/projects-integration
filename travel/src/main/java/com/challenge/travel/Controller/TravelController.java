package com.challenge.travel.Controller;

import com.challenge.travel.DTO.InfosDeViagemDto;
import com.challenge.travel.Utils.CalculoValorPassagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api")
public class TravelController {

    @Autowired
    private CalculoValorPassagem calculo;

    @GetMapping
    public ResponseEntity<InfosDeViagemDto> getValorPassagem(@RequestParam (name = "destino") String destino){
        return ResponseEntity.ok(calculo.valorPassagem(destino));
    }
}