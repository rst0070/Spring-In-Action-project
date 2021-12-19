package tryspring.phonebook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhonebookController {
    
    /**
     * 현재 전화번호부 보여줌.
     */
    @GetMapping("/")
    public String currentBook(){
        return "phonebook";
    }

    /**
     * form 페이지 요청왔을때
     */
    @GetMapping("/add")
    public String formPage(){
        return "phonebook-form";
    }

    /**
     * 전화번호 추가하는 post요청 왔을때.
     */
    @PostMapping("/add")
    public String addNumber(){
        return "redirect:/";
    }
}
