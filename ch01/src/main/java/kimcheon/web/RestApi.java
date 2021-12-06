package kimcheon.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/api")
public class RestApi {
    
    @GetMapping
    public String get(){
        return "hello";
    }
}
