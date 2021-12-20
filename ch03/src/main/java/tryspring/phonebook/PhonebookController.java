package tryspring.phonebook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.validation.Valid;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class PhonebookController implements WebMvcConfigurer{
    
    final Logger logger = LoggerFactory.getLogger(PhonebookController.class);
    

    
    /**
     * form 페이지 요청왔을때
     */
    @GetMapping("/")
    public String formPage(Model model,InformationDomain domain){
        logger.info("새로운 요청 발생");
        return "phonebook-form";
    }

    /**
     * 전화번호 추가하는 post요청 왔을때.
     */
    @PostMapping("/")
    public String addNumber(@Valid InformationDomain domain, Errors error){
        if(error.hasErrors()) return "phonebook-form";
        logger.info(domain.getEmail());
        return "redirect:/";
    }
}
