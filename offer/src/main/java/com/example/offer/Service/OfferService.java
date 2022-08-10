package com.example.offer.Service;

import com.example.offer.Client.TravelClient;
import com.example.offer.DTO.InfosDeViagemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferService {

    @Autowired
    private TravelClient travelClient;

    public InfosDeViagemDto getCotacao(String destino){
        return  travelClient.getCotacao(destino);
    }
}
