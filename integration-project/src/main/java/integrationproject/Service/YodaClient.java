package integrationproject.Service;

import integrationproject.DTO.TranslateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "yodaclient", url = "https://api.funtranslations.com/translate/yoda.json")
public interface YodaClient {

    @PostMapping
    TranslateDto getTranslate(@RequestParam("text") String text);
}
