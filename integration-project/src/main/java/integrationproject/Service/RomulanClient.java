package integrationproject.Service;

import integrationproject.DTO.TranslateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "romulanclient", url = "https://api.funtranslations.com/translate/romulan.json")
public interface RomulanClient {

    @PostMapping
    TranslateDto translateText(@RequestParam("text") String text);
}
