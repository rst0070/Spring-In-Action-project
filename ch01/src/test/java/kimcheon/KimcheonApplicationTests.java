package kimcheon;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import kimcheon.web.HomeController;

//@ExtendWith(SpringExtension.class)
@SpringBootTest
public class KimcheonApplicationTests {

	@Autowired
	private HomeController homeController;

	@Test
	void contextLoads() {
		assertThat(homeController).isNotNull();
	}

}
