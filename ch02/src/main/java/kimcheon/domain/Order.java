package kimcheon.domain;

import java.util.List;
import lombok.Data;
import javax.validation.constraints.Size;
//import javax.persistence.*;

//@Entity
@Data
public class Order {
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //@ManyToMany(targetEntity = Dish.class)
    @Size(min=1, message="1개 이상의 메뉴를 주문하세요.")
    private List<Dish> dishes;
}
