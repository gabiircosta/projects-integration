package integrationproject.Service;

import integrationproject.DTO.TranslateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "minioniclient", url = "https://api.funtranslations.com/translate/minion.json")
public interface MinionClient {

    @PostMapping
    TranslateDto translateText(@RequestParam("text") String text);
}
