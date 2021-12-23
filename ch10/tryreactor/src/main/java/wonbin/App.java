package wonbin;

import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.CoreSubscriber;
import wonbin.reactor.*;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ){
        logger.info("try reactor app started");

        Flux<Action> actions = 
            Flux.just(new CreateAction());

        actions.subscribe(new ExecuteAction());
    }

    static class ExecuteAction implements CoreSubscriber<Action> {
        @Override
        public void onSubscribe(Subscription subscription){
            logger.info(subscription.toString());
        }

        @Override
        public void onNext(Action action){
            
        }

        @Override
        public void onError(Throwable ex){

        }
        
        @Override
        public void onComplete(){

        }
    }
}
