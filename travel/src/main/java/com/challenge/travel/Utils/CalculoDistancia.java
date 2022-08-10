package com.challenge.travel.Utils;

import com.challenge.travel.Enum.PaisesEnum;
import org.springframework.stereotype.Component;

@Component
public class CalculoDistancia {

    public int returnDistance (String destino){

        if (destino.equals(PaisesEnum.EUA.getName())){
            return 8500;
        }
        if (destino.equals(PaisesEnum.INGLATERRA.getName())){
            return 10500;
        }
        if (destino.equals(PaisesEnum.FRANCA.getName())){
            return 12500;
        }
        if (destino.equals(PaisesEnum.CANADA.getName())){
            return 14500;
        }
        else return 0;
    }

}
