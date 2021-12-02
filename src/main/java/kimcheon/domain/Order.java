package kimcheon.domain;

import java.util.List;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany(targetEntity = Dish.class)
    private List<Dish> dishes;
}
