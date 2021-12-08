package kimcheon.domain;

import lombok.Data;
import javax.validation.constraints.*;

@Data
public class Delivery {

    private long id;

    private String name;

    private String street;

    private String city;

    private String state;

    private String ccNumber;

    private String ccExpiration;

    private String ccCVV;
}
