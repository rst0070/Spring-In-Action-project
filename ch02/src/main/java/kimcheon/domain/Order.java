package kimcheon.domain;

import java.util.List;
import lombok.Data;

@Data
public class Order {
    
    private long id;

    private List<Dish> dishes;

    private Delivery delivery;
}
