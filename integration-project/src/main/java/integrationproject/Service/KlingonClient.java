package integrationproject.Service;

import integrationproject.DTO.TranslateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "klingonclient", url = "https://api.funtranslations.com/translate/klingon.json")
public interface KlingonClient {

    @PostMapping
    TranslateDto translateText(@RequestParam("text") String text);
}
