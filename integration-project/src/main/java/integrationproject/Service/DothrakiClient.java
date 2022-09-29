package integrationproject.Service;

import integrationproject.DTO.TranslateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "dothrakiclient", url = "https://api.funtranslations.com/translate/dothraki.json")
public interface DothrakiClient {

    @PostMapping
    TranslateDto translateText(@RequestParam("text") String text);
}
