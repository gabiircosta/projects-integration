package integrationproject.Service;

import integrationproject.DTO.TranslateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "shakespeareclient", url = "https://api.funtranslations.com/translate/shakespeare.json")
public interface ShakespeareClient {

    @PostMapping
    TranslateDto translateText(@RequestParam("text") String text);
}
