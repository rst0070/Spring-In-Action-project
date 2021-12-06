package kimcheon;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Server를 실행하여 실제로 http요청에 대한 반응을 test한다.
 * 
 * webEnvironment.RANDOM_PORT 를 통해 랜덤으로 서버포트를 지정하여 실행시킨다.
 * 테스트 환경에서는 복잡하게 포트를 사용할 수 있으므로 이를 통해 충돌을 방지한다.
 * 
 * 또한 이렇게 지정된 포트를 @LocalServerPort를 통해 주입가능
 * 
 * TestRestTemplate를 autowired하여 사용가능
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate rest;

    @Test
    public void getTest(){
        String obj = rest.getForObject("http://localhost:"+port+"/api", String.class);
        assertThat(obj).contains("hello");
    }
}
