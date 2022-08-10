package com.example.offer.Client;

import com.example.offer.DTO.InfosDeViagemDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "travelclient" ,url = "localhost:8080/api")
public interface TravelClient {

        @RequestMapping(method = RequestMethod.GET, params = "destino") //não tava dando certo pq não tava declarado que tinha um param sendo recebido
        InfosDeViagemDto  getCotacao(@RequestParam(name = "destino") String destino);

}
