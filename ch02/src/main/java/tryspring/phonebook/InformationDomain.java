package tryspring.phonebook;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
/**
 * 전화번호 저장하는 객체
 * 이름, 전화번호, 이메일을 필드로 가짐
 */
@Data
public class InformationDomain {
    
    @NotBlank(message = "name is required.")
    String name;

    @NotBlank
    @Pattern(regexp = "([0-9][0-9][0-9])(-)([0-9][0-9][0-9][0-9])(-)([0-9][0-9][0-9][0-9])")
    String number;

    @NotBlank
    @Pattern(regexp = "(*)(@)(*)(.)(*)")
    String email;
}
