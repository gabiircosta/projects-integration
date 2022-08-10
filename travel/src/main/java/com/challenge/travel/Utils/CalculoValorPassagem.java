package com.challenge.travel.Utils;

import com.challenge.travel.DTO.InfosDeViagemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculoValorPassagem {

    @Autowired
    private CalculoDistancia calculoDistancia;

    public InfosDeViagemDto valorPassagem (String destino){
        int distancia = calculoDistancia.returnDistance(destino);

        InfosDeViagemDto infos  = new InfosDeViagemDto();
        infos.setOrigem("Brasil");
        infos.setDestino(destino);
        infos.setDistancia(distancia);

        if(distancia <= 5000){
            infos.setValor(distancia * 0.77);
        }
        else if(distancia <= 11000){
            infos.setValor(distancia * 0.57);
        }
        else {
            infos.setValor(distancia * 0.44);
        }

        return infos;
    }
}
