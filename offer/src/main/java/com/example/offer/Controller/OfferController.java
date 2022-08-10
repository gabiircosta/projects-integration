package com.example.offer.Controller;

import com.example.offer.DTO.InfosDeViagemDto;
import com.example.offer.Service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/api")
public class OfferController {

    @Autowired
    private OfferService offerService;

    @GetMapping ("/{destino}")
    public ResponseEntity<InfosDeViagemDto> getCotacao (@PathVariable("destino") String destino) {
        return ResponseEntity.ok(offerService.getCotacao(destino));
    }
}
