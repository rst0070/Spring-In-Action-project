package kimcheon.domain;

import javax.persistence.Entity;
/*
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
*/
import lombok.Data;
import javax.validation.constraints.NotNull;
@Entity
@Data
public class Dish {
    
    public static enum Type{
        kimbab("김밥", 3),
        porkCutlet("돈까스", 8),
        porridge("죽", 4);

        private String koreanName;
        private double price;

        private Type(String koreanName, double price){
            this.koreanName = koreanName;
            this.price = price;
        }
        
        @Override
        public String toString(){
            return koreanName;
        }

        public String getName(){ return koreanName;}
        public Double getPrice(){ return price;}
        
    };

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    
    @NotNull
    private Type type;
    
    private String name;

    public Dish(){super();}

    public Dish(Type type){
        this();
        this.type = type;
        this.name = type.getName();
    }

}
