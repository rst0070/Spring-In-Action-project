package kimcheon.domain;

import lombok.Data;

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

    private Type name;

}
