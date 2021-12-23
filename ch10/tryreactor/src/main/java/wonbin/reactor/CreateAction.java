package wonbin.reactor;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class CreateAction implements Action {
    public CreateAction(){
        
    }   

    @Override
    public void action(){
        Flux<String> flux = Flux.just("김밥", "떡볶이", "라면");
    }
}
