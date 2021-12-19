package tryspring.phonebook;

import lombok.Data;
//import javax.validation.constraints.

/**
 * 전화번호 저장하는 객체
 * 이름, 전화번호, 이메일을 필드로 가짐
 */
@Data
public class InformationDomain {
    

    String name;
    String number;
    String email;
}
