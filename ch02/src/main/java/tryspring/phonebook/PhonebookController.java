package tryspring.phonebook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

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
    public String formPage(Model model){
        model.addAttribute("data", new InformationDomain());
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
