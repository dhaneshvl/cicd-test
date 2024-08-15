package com.turf.tracker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcResultHandlersDsl;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
class TurfTrackerApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testWelcomeEndpoint() throws Exception {

        String name = "Dhanesh Waran";

        mockMvc.perform(MockMvcRequestBuilders.get("/welcome/{name}", name))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello " + name));

    }

}