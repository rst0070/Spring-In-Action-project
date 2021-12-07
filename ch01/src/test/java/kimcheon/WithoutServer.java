package kimcheon;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
/**
 * @AutoConfigureMockMvc를 사용하는 방법은
 * 서버를 실행시키지는 않지만 전체 spring application을 가동시키는 방식이다.
 */

@SpringBootTest
@AutoConfigureMockMvc
public class WithoutServer{

    @Autowired
    private MockMvc mvc;
    
    @Test
    public void messageTest() throws Exception {
        mvc.perform(get("/api"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("hello")));
    }
}