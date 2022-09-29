package integrationproject.Service;

import integrationproject.DTO.TranslateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    @Autowired
    private YodaClient clientY;

    @Autowired
    private DothrakiClient clientD;

    @Autowired
    private KlingonClient clientK;

    @Autowired
    private RomulanClient clientR;

    @Autowired
    private MinionClient clientM;

    @Autowired
    private ShakespeareClient clientS;

    public TranslateDto translateYodaText(String text) {
        return clientY.getTranslate(text);
    }

    public TranslateDto translateDothrakiText(String text) {
        return clientD.translateText(text);
    }

    public TranslateDto translateKlingonText(String text) {
        return clientK.translateText(text);
    }

    public TranslateDto translateRomulanText(String text) {
        return clientR.translateText(text);
    }

    public TranslateDto translateMinionText(String text) {
        return clientM.translateText(text);
    }

    public TranslateDto translateShakespeareText(String text) {
        return clientS.translateText(text);
    }
 }