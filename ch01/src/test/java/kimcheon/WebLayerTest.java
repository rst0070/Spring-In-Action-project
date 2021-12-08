package kimcheon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@WebMvcTest
public class WebLayerTest {
    
    @Autowired
    private MockMvc mvc;

    @Test
    public void testWebLayer() throws Exception{
        this.mvc.perform(get("/api"))
            .andDo(print())
            .andExpect(status().isOk())
			.andExpect(content().string(containsString("hello")));
    }
}
