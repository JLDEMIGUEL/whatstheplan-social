package com.whatstheplan.social.integration;

import com.whatstheplan.social.testconfig.BaseIntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class SocialControllerIntegrationTest extends BaseIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testEndpoint_ShouldReturnUp() throws Exception {
        mockMvc.perform(get("/social/test"))
                .andExpect(status().isOk());
    }
}