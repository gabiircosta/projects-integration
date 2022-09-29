package integrationproject.Controller;

import integrationproject.DTO.TranslateDto;
import integrationproject.Service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class IntegrationController {

    @Autowired
    private IntegrationService service;

    @PostMapping("/yoda")
    public TranslateDto translateYodaText (@RequestParam("text") String text){
        return service.translateYodaText(text);
    }

    @PostMapping("/dothraki")
    public TranslateDto translateDothrakiText (@RequestParam("text") String text){
        return service.translateDothrakiText(text);
    }

    @PostMapping("/klingon")
    public TranslateDto translateKlingonText (@RequestParam("text") String text){
        return service.translateKlingonText(text);
    }

    @PostMapping("/romulan")
    public TranslateDto translateRomulanText (@RequestParam("text") String text){
        return service.translateRomulanText(text);
    }

    @PostMapping("/minion")
    public TranslateDto translateMinionText (@RequestParam("text") String text){
        return service.translateMinionText(text);
    }

    @PostMapping("/shakespeare")
    public TranslateDto translateShakespeareText (@RequestParam("text") String text){
        return service.translateShakespeareText(text);
    }
}
