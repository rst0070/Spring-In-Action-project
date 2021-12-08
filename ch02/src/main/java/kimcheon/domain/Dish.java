package kimcheon.domain;

import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class Dish {
    
    public static enum Type{
        kimbap1("원조김밥", 2000),
        kimbap2("야채김밥", 3000),
        kimbap3("고추김밥", 3000),
        kimbap4("참치김밥", 3500),
        kimbap5("치즈김밥", 3000),
        kimbap6("김치김밥", 3000),
        kimbap7("소고기김밥", 3500),
        kimbap8("날치알김밥", 3500),
        kimbap9("돈까스김밥", 3500),
        kimbap10("새우김밥", 3500),
        kimbap11("멸추김밥", 3500),
        kimbap12("매운제육김밥", 3500),
        kimbap13("모듬김밥", 4000),
        ramen1("라면", 3000),
        ramen2("떡라면", 3500),
        ramen3("치즈라면", 3500),
        ramen4("만두라면", 3500),
        ramen5("김치라면", 3500),
        ramen6("짬뽕라면", 3500),
        ramen7("콩나물라면", 3500),
        tteokbokki1("떡볶이", 3500),
        tteokbokki2("라볶이", 3500),
        tteokbokki3("쫄볶이", 3500),
        tteokbokki4("치즈라볶이", 4000),
        tteokbokki5("치즈떡볶이", 4000),
        tteokbokki6("치즈쫄볶이", 4000),
        tteokbokki7("특스페셜떡볶이", 5000);

        private String name;
        private double price;

        private Type(String name, double price){
            this.name = name;
            this.price = price;
        }
        
        @Override
        public String toString(){
            return name;
        }

        public String getName(){ return name;}
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
